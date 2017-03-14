package com.migeran.moe.ui;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;

import apple.foundation.NSBundle;
import apple.foundation.NSDictionary;
import apple.foundation.NSIndexPath;
import apple.uikit.UITableView;
import apple.uikit.UITableViewCell;
import apple.uikit.UITableViewController;
import apple.uikit.enums.UITableViewCellAccessoryType;
import apple.uikit.enums.UITableViewCellStyle;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("DataPickerViewController")
@RegisterOnStartup
public class DataPickerViewController extends UITableViewController {

    private DataPickerState dataState;;

    @Owned
    @Selector("alloc")
    public static native DataPickerViewController alloc();

    @Selector("init")
    public native DataPickerViewController init();

    protected DataPickerViewController(Pointer peer) {
        super(peer);
    }

    public DataPickerViewController initWithNibNameBundle(String s, NSBundle nsBundle,
                                                          DataPickerState state) {
        DataPickerViewController controller = (DataPickerViewController) super
                .initWithNibNameBundle(s, nsBundle);

        controller.dataState = state;
        return controller;
    }

    @Override
    public long numberOfSectionsInTableView(UITableView uiTableView) {
        return 1;
    }

    @Override
    public long tableViewNumberOfRowsInSection(UITableView uiTableView, @NInt long l) {
        return dataState.getCellLabels().size();
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

        NSDictionary cellLabelDict = dataState.getCellLabels().get((int) indexPath.row());
        String cellLabelText = (String) cellLabelDict.get(DataPickerState.kLabelKey);
        if (cellLabelDict.objectForKey(DataPickerState.kShortLabelKey) != null) {
            cellLabelText = (String) cellLabelDict.objectForKey(DataPickerState.kShortLabelKey);
        }
        cell.textLabel().setText(cellLabelText);
        // If the cell is selected, mark it as checked
        if (dataState.getSelectedCells().contains(cellLabelDict.get(DataPickerState.kLabelKey))) {
            cell.setAccessoryType(UITableViewCellAccessoryType.Checkmark);
        } else {
            cell.setAccessoryType(UITableViewCellAccessoryType.None);
        }
        return cell;
    }

    @Override
    public void tableViewDidSelectRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        UITableViewCell selectedCell = tableView.cellForRowAtIndexPath(indexPath);
        NSDictionary selectedCellDict = dataState.getCellLabels().get((int) indexPath.row());
        String label = (String) selectedCellDict.get(DataPickerState.kLabelKey);

        if (dataState.isMultipleSelectEnabled()) {
            // If multiple selections are allowed, then toggle the state
            // of the selected cell
            if (dataState.getSelectedCells().contains(label)) {
                dataState.getSelectedCells().remove(label);
                selectedCell.setAccessoryType(UITableViewCellAccessoryType.None);
            } else {
                dataState.getSelectedCells().add(label);
                selectedCell.setAccessoryType(UITableViewCellAccessoryType.Checkmark);
            }
        } else {
            // Set all cells to unchecked except for the one that was just selected
            dataState.getSelectedCells().clear();
            dataState.getSelectedCells().add(label);

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
