package com.migeran.moe.ui;


import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;

import java.util.Vector;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSNumber;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("DataPickerState")
@RegisterOnStartup
public class DataPickerState extends NSObject {

    public static final String kMultipleSelectKey = "multiple-select";
    public static final String kElementsKey = "elements";
    public static final String kLabelKey = "label";
    public static final String kShortLabelKey = "shortLabel";
    public static final String kSelectedKey = "selected";

    private boolean multipleSelectEnabled = false;
    private Vector<NSMutableDictionary> cellLabels;

    private Vector<String> selectedCells;

    @Owned
    @Selector("alloc")
    public static native DataPickerState alloc();

    @Selector("init")
    public native DataPickerState init();

    public DataPickerState(Pointer peer) {
        super(peer);
    }

    public DataPickerState initWithDictionary(NSDictionary dict) {
        DataPickerState dataPickerState = init();

        NSNumber nsNumber = (NSNumber) dict.objectForKey(kMultipleSelectKey);

        dataPickerState.multipleSelectEnabled = nsNumber.boolValue();

        Vector<NSMutableDictionary> cellLabels = new Vector<>();
        Vector<String> selectedCells = new Vector<>();

        NSArray<NSDictionary> elements = (NSArray<NSDictionary>) dict.objectForKey(kElementsKey);

        for (NSDictionary elementDict : elements) {
            NSMutableDictionary cellLabelDict = NSMutableDictionary.dictionary();
            String label = (String) elementDict.objectForKey(kLabelKey);
            cellLabelDict.put(kLabelKey, label);

            if (elementDict.objectForKey(kShortLabelKey) != null) {
                cellLabelDict.put(kShortLabelKey, elementDict.objectForKey(kShortLabelKey));
            }
            cellLabels.add(cellLabelDict);

            // Default selection mode is unselected, unless specified in plist.
            if (elementDict.objectForKey(kSelectedKey) != null) {
                selectedCells.add(label);
            }
        }

        dataPickerState.cellLabels = cellLabels;
        dataPickerState.selectedCells = selectedCells;

        return dataPickerState;
    }

    public Vector<String> getSelectedCells() {
        return selectedCells;
    }

    public Vector<NSMutableDictionary> getCellLabels() {
        return cellLabels;
    }

    public boolean isMultipleSelectEnabled() {
        return multipleSelectEnabled;
    }
}
