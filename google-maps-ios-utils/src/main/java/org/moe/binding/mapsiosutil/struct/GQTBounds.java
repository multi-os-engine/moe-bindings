package org.moe.binding.mapsiosutil.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class GQTBounds extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public GQTBounds() {
		super(GQTBounds.class);
	}

	@Generated
	protected GQTBounds(Pointer peer) {
		super(peer);
	}

	@Generated
	public GQTBounds(double minX, double minY, double maxX, double maxY) {
		super(GQTBounds.class);
		setMinX(minX);
		setMinY(minY);
		setMaxX(maxX);
		setMaxY(maxY);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native double minX();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setMinX(double value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native double minY();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMinY(double value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native double maxX();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setMaxX(double value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native double maxY();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setMaxY(double value);
}