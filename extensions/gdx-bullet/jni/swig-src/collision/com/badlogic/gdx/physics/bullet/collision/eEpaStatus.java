/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

public final class eEpaStatus {
	public final static int eEpaValid = 0;
	public final static int eEpaTouching = eEpaValid + 1;
	public final static int eEpaDegenerated = eEpaTouching + 1;
	public final static int eEpaNonConvex = eEpaDegenerated + 1;
	public final static int eEpaInvalidHull = eEpaNonConvex + 1;
	public final static int eEpaOutOfFaces = eEpaInvalidHull + 1;
	public final static int eEpaOutOfVertices = eEpaOutOfFaces + 1;
	public final static int eEpaAccuraryReached = eEpaOutOfVertices + 1;
	public final static int eEpaFallBack = eEpaAccuraryReached + 1;
	public final static int eEpaFailed = eEpaFallBack + 1;
}
