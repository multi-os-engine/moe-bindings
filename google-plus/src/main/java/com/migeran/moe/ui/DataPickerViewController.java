package com.migeran.moe.ui;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;

import java.util.List;
import java.util.Map;

import apple.foundation.NSBundle;
import apple.foundation.NSIndexPath;
import apple.uikit.UITableView;
import apple.uikit.UITableViewCell;
import apple.uikit.UITableViewController;
import apple.uikit.enums.UITableViewCellAccessoryType;
import apple.uikit.enums.UITableViewCellStyle;

import static com.migeran.moe.ui.DataPickerState.kLabelKey;
import static com.migeran.moe.ui.DataPickerState.kShortLabelKey;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("DataPickerViewController")
@RegisterOnStartup
public class DataPickerViewController extends UITableViewController {

    private DataPickerState dataState;

    @Owned
    @Selector("alloc")
    public static native DataPickerViewController alloc();

    @Selector("init")
    public native DataPickerViewController init();

    protected DataPickerViewController(Pointer peer) {
        super(peer);
    }

    public DataPickerViewController initWithNibNameBundleDateState(String nibNameOrNil, NSBundle
            nibBundleOrNil, DataPickerState dataState) {
        DataPickerViewController controller = (DataPickerViewController) super.initWithNibNameBundle(nibNameOrNil,
                nibBundleOrNil);

        if (controller != null) {
            controller.dataState = dataState;
        }

        return controller;
    }

    @Override
    public long numberOfSectionsInTableView(UITableView tableView) {
        return 1;
    }

    @Override
    public long tableViewNumberOfRowsInSection(UITableView tableView, @NInt long section) {
        return dataState.getSelectedLabels().size();
    }

    @Override
    public UITableViewCell tableViewCellForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        String kCellIdentifier = "Cell";
        UITableViewCell cell =
        tableView.dequeueReusableCellWithIdentifier(kCellIdentifier);

        if (cell == null) {
            cell = UITableViewCell.alloc().initWithStyleReuseIdentifier(UITableViewCellStyle
                    .Default, kCellIdentifier);
        }

        Map<String, String> cellLabelDict = dataState.cellLabels.get((int) indexPath.row());
        String cellLabelText = cellLabelDict.get(kLabelKey);
        if (cellLabelDict.get(kShortLabelKey) != null) {
            cellLabelText = cellLabelDict.get(kShortLabelKey);
        }
        cell.textLabel().setText(cellLabelText);
        // If the cell is selected, mark it as checked
        if (dataState.getSelectedCells().contains(cellLabelDict.get(kLabelKey))) {
            cell.setAccessoryType(UITableViewCellAccessoryType.Checkmark);
        } else {
            cell.setAccessoryType(UITableViewCellAccessoryType.None);
        }
        return cell;
    }

    @Override
    public void tableViewDidSelectRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        UITableViewCell selectedCell = tableView.cellForRowAtIndexPath(indexPath);
        Map<String, String> selectedCellDict = dataState.cellLabels.get((int) indexPath.row());
        String label = selectedCellDict.get(kLabelKey);

        if (dataState.multipleSelectEnabled) {
            // If multiple selections are allowed, then toggle the state
            // of the selected cell
            if (dataState.selectedCells.contains(label)) {
                dataState.selectedCells.remove(label);
                selectedCell.setAccessoryType(UITableViewCellAccessoryType.None);
            } else {
                dataState.selectedCells.add(label);
                selectedCell.setAccessoryType(UITableViewCellAccessoryType.Checkmark);
            }
        } else {
            // Set all cells to unchecked except for the one that was just selected
            dataState.selectedCells.clear();
            dataState.selectedCells.add(label);

            for (NSIndexPath curPath : tableView.indexPathsForVisibleRows()) {
                UITableViewCell cell = tableView.cellForRowAtIndexPath(curPath);
                if (curPath.row() == indexPath.row()) {
                    cell.setAccessoryType(UITableViewCellAccessoryType.Checkmark);
                } else {
                    cell.setAccessoryType(UITableViewCellAccessoryType.None);
                }
            }
        }
        tableView.deselectRowAtIndexPathAnimated(indexPath, true);
    }
}
