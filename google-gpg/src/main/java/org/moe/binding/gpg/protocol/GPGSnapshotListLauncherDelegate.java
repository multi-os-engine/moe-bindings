package org.moe.binding.gpg.protocol;


import org.moe.binding.gpg.GPGSnapshotMetadata;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("gpg")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GPGSnapshotListLauncherDelegate")
public interface GPGSnapshotListLauncherDelegate {
	@Generated
	@IsOptional
	@Selector("maxSaveSlotsForSnapshotListLauncher")
	default int maxSaveSlotsForSnapshotListLauncher() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("shouldAllowCreateForSnapshotListLauncher")
	default boolean shouldAllowCreateForSnapshotListLauncher() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("shouldAllowDeleteForSnapshotListLauncher")
	default boolean shouldAllowDeleteForSnapshotListLauncher() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("snapshotListLauncherDidCreateNewSnapshot")
	void snapshotListLauncherDidCreateNewSnapshot();

	@Generated
	@Selector("snapshotListLauncherDidTapSnapshotMetadata:")
	void snapshotListLauncherDidTapSnapshotMetadata(GPGSnapshotMetadata snapshot);

	@Generated
	@IsOptional
	@Selector("titleForSnapshotListLauncher")
	default String titleForSnapshotListLauncher() {
		throw new java.lang.UnsupportedOperationException();
	}
}