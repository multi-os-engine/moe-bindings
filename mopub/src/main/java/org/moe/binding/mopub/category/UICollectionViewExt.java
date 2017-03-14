package org.moe.binding.mopub.category;


import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
import apple.foundation.NSIndexSet;
import apple.uikit.UICollectionView;
import apple.uikit.UICollectionViewCell;
import apple.uikit.UICollectionViewLayoutAttributes;
import org.moe.binding.mopub.MPCollectionViewAdPlacer;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCCategory;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCCategory(UICollectionView.class)
public final class UICollectionViewExt {
	static {
		NatJ.register();
	}

	@Generated
	private UICollectionViewExt() {
	}

	@Generated
	@Selector("mp_adPlacer")
	public static native MPCollectionViewAdPlacer mp_adPlacer(
			UICollectionView _object);

	@Generated
	@Selector("mp_cellForItemAtIndexPath:")
	public static native UICollectionViewCell mp_cellForItemAtIndexPath(
			UICollectionView _object, NSIndexPath indexPath);

	@Generated
	@Selector("mp_dataSource")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object mp_dataSource(UICollectionView _object);

	@Generated
	@Selector("mp_delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object mp_delegate(UICollectionView _object);

	@Generated
	@Selector("mp_deleteItemsAtIndexPaths:")
	public static native void mp_deleteItemsAtIndexPaths(
			UICollectionView _object, NSArray<?> indexPaths);

	@Generated
	@Selector("mp_deleteSections:")
	public static native void mp_deleteSections(UICollectionView _object,
			NSIndexSet sections);

	@Generated
	@Selector("mp_dequeueReusableCellWithReuseIdentifier:forIndexPath:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object mp_dequeueReusableCellWithReuseIdentifierForIndexPath(
			UICollectionView _object, String identifier, NSIndexPath indexPath);

	@Generated
	@Selector("mp_deselectItemAtIndexPath:animated:")
	public static native void mp_deselectItemAtIndexPathAnimated(
			UICollectionView _object, NSIndexPath indexPath, boolean animated);

	@Generated
	@Selector("mp_indexPathForCell:")
	public static native NSIndexPath mp_indexPathForCell(
			UICollectionView _object, UICollectionViewCell cell);

	@Generated
	@Selector("mp_indexPathForItemAtPoint:")
	public static native NSIndexPath mp_indexPathForItemAtPoint(
			UICollectionView _object, @ByValue CGPoint point);

	@Generated
	@Selector("mp_indexPathsForSelectedItems")
	public static native NSArray<?> mp_indexPathsForSelectedItems(
			UICollectionView _object);

	@Generated
	@Selector("mp_indexPathsForVisibleItems")
	public static native NSArray<?> mp_indexPathsForVisibleItems(
			UICollectionView _object);

	@Generated
	@Selector("mp_insertItemsAtIndexPaths:")
	public static native void mp_insertItemsAtIndexPaths(
			UICollectionView _object, NSArray<?> indexPaths);

	@Generated
	@Selector("mp_insertSections:")
	public static native void mp_insertSections(UICollectionView _object,
			NSIndexSet sections);

	@Generated
	@Selector("mp_layoutAttributesForItemAtIndexPath:")
	public static native UICollectionViewLayoutAttributes mp_layoutAttributesForItemAtIndexPath(
			UICollectionView _object, NSIndexPath indexPath);

	@Generated
	@Selector("mp_moveItemAtIndexPath:toIndexPath:")
	public static native void mp_moveItemAtIndexPathToIndexPath(
			UICollectionView _object, NSIndexPath indexPath,
			NSIndexPath newIndexPath);

	@Generated
	@Selector("mp_moveSection:toSection:")
	public static native void mp_moveSectionToSection(UICollectionView _object,
			@NInt long section, @NInt long newSection);

	@Generated
	@Selector("mp_reloadData")
	public static native void mp_reloadData(UICollectionView _object);

	@Generated
	@Selector("mp_reloadItemsAtIndexPaths:")
	public static native void mp_reloadItemsAtIndexPaths(
			UICollectionView _object, NSArray<?> indexPaths);

	@Generated
	@Selector("mp_reloadSections:")
	public static native void mp_reloadSections(UICollectionView _object,
			NSIndexSet sections);

	@Generated
	@Selector("mp_scrollToItemAtIndexPath:atScrollPosition:animated:")
	public static native void mp_scrollToItemAtIndexPathAtScrollPositionAnimated(
			UICollectionView _object, NSIndexPath indexPath,
			@NUInt long scrollPosition, boolean animated);

	@Generated
	@Selector("mp_selectItemAtIndexPath:animated:scrollPosition:")
	public static native void mp_selectItemAtIndexPathAnimatedScrollPosition(
			UICollectionView _object, NSIndexPath indexPath, boolean animated,
			@NUInt long scrollPosition);

	@Generated
	@Selector("mp_setAdPlacer:")
	public static native void mp_setAdPlacer(UICollectionView _object,
			MPCollectionViewAdPlacer placer);

	@Generated
	@Selector("mp_setDataSource:")
	public static native void mp_setDataSource(UICollectionView _object,
			@Mapped(ObjCObjectMapper.class) Object dataSource);

	@Generated
	@Selector("mp_setDelegate:")
	public static native void mp_setDelegate(UICollectionView _object,
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("mp_visibleCells")
	public static native NSArray<?> mp_visibleCells(UICollectionView _object);
}