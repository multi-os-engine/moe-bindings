package com.migeran.moe.ui;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.objc.ann.Selector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMutableArray;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSMutableSet;
import apple.foundation.NSNumber;
import apple.foundation.NSString;
import apple.uikit.UICollectionViewLayoutAttributes;

public class DataPickerState extends NSObject {

    public static String kMultipleSelectKey = "multiple-select";
    public static String kElementsKey = "elements";
    public static String kLabelKey = "label";
    public static String kShortLabelKey = "shortLabel";
    public static String kSelectedKey = "selected";

    boolean multipleSelectEnabled;

    List<Map<String, String>> cellLabels;
    List<String> selectedCells;

    @Owned
    @Selector("alloc")
    public static native DataPickerState alloc();

    @Selector("init")
    public native DataPickerState init();

    protected DataPickerState(Pointer peer) {
        super(peer);
    }

    public DataPickerState initWithDictionary(NSDictionary dict) {
        DataPickerState dataPickerState = init();
        if (dataPickerState != null) {
            dataPickerState.multipleSelectEnabled =
            ((NSNumber) dict.objectForKey(kMultipleSelectKey)).boolValue();

            List<Map<String, String>> cellLabels = new ArrayList<>();
            List<String> selectedCells = new ArrayList<>();

            NSArray<NSDictionary> elements = (NSArray) dict.objectForKey(kElementsKey);
            for (NSDictionary elementDict : elements) {
                Map<String, String> cellLabelDict = new HashMap<>();
                String label = (String) elementDict.objectForKey(kLabelKey);
                cellLabelDict.put(kLabelKey, label);

                if (elementDict.objectForKey(kShortLabelKey) != null) {
                    cellLabelDict.put(kShortLabelKey, (String) elementDict.objectForKey(kShortLabelKey));
                }
                cellLabels.add(cellLabelDict);

                // Default selection mode is unselected, unless specified in plist.
                NSNumber value = (NSNumber) elementDict.objectForKey(kSelectedKey);
                if (value != null && value.boolValue()) {
                    selectedCells.add(label);
                }
            }

            dataPickerState.cellLabels = cellLabels;
            dataPickerState.selectedCells = selectedCells;
        }
        return dataPickerState;
    }

    public List<String> getSelectedCells() {
        return selectedCells;
    }

    public List<Map<String, String>> getSelectedLabels() {
        return cellLabels;
    }
}
