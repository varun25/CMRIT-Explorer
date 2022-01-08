package com.beyondar.android.view;

import com.beyondar.android.world.BeyondarObject;

import java.util.ArrayList;

/**
 * On clickclick listener to detect when a
 * {@link com.beyondar.android.world.BeyondarObject BeyondarObject} has been
 * clicked on the {@link BeyondarGLSurfaceView
 * BeyondarGLSurfaceView}.
 */
public interface OnClickBeyondarObjectListener {

	/**
	 * This method is called when the user clickclick on a {@link com.beyondar.android.world.BeyondarObject BeyondarObject}
	 * 
	 * @param beyondarObjects
	 *            All the {@link com.beyondar.android.world.BeyondarObject BeyondarObject} that collide with the ray
	 *            generated by the user clickclick. If no object have been clicked
	 *            the {@link ArrayList} will be empty
	 */
	public void onClickBeyondarObject(ArrayList<BeyondarObject> beyondarObjects);

}