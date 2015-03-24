/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.extras;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btWorldImporter extends BulletBase {
	private long swigCPtr;
	
	protected btWorldImporter(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btWorldImporter, normally you should not need this constructor it's intended for low-level usage. */ 
	public btWorldImporter(long cPtr, boolean cMemoryOwn) {
		this("btWorldImporter", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btWorldImporter obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				ExtrasJNI.delete_btWorldImporter(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btWorldImporter(btDynamicsWorld world) {
    this(ExtrasJNI.new_btWorldImporter(btDynamicsWorld.getCPtr(world), world), true);
  }

  public void deleteAllData() {
    ExtrasJNI.btWorldImporter_deleteAllData(swigCPtr, this);
  }

  public void setVerboseMode(int verboseMode) {
    ExtrasJNI.btWorldImporter_setVerboseMode(swigCPtr, this, verboseMode);
  }

  public int getVerboseMode() {
    return ExtrasJNI.btWorldImporter_getVerboseMode(swigCPtr, this);
  }

  public int getNumCollisionShapes() {
    return ExtrasJNI.btWorldImporter_getNumCollisionShapes(swigCPtr, this);
  }

  public btCollisionShape getCollisionShapeByIndex(int index) {
    long cPtr = ExtrasJNI.btWorldImporter_getCollisionShapeByIndex(swigCPtr, this, index);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public int getNumRigidBodies() {
    return ExtrasJNI.btWorldImporter_getNumRigidBodies(swigCPtr, this);
  }

  public btCollisionObject getRigidBodyByIndex(int index) {
	return btCollisionObject.getInstance(ExtrasJNI.btWorldImporter_getRigidBodyByIndex(swigCPtr, this, index), false);
}

  public int getNumConstraints() {
    return ExtrasJNI.btWorldImporter_getNumConstraints(swigCPtr, this);
  }

  public btTypedConstraint getConstraintByIndex(int index) {
    long cPtr = ExtrasJNI.btWorldImporter_getConstraintByIndex(swigCPtr, this, index);
    return (cPtr == 0) ? null : new btTypedConstraint(cPtr, false);
  }

  public int getNumBvhs() {
    return ExtrasJNI.btWorldImporter_getNumBvhs(swigCPtr, this);
  }

  public btOptimizedBvh getBvhByIndex(int index) {
    long cPtr = ExtrasJNI.btWorldImporter_getBvhByIndex(swigCPtr, this, index);
    return (cPtr == 0) ? null : new btOptimizedBvh(cPtr, false);
  }

  public int getNumTriangleInfoMaps() {
    return ExtrasJNI.btWorldImporter_getNumTriangleInfoMaps(swigCPtr, this);
  }

  public btTriangleInfoMap getTriangleInfoMapByIndex(int index) {
    long cPtr = ExtrasJNI.btWorldImporter_getTriangleInfoMapByIndex(swigCPtr, this, index);
    return (cPtr == 0) ? null : new btTriangleInfoMap(cPtr, false);
  }

  public btCollisionShape getCollisionShapeByName(String name) {
    long cPtr = ExtrasJNI.btWorldImporter_getCollisionShapeByName(swigCPtr, this, name);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public btRigidBody getRigidBodyByName(String name) {
	return btRigidBody.getInstance(ExtrasJNI.btWorldImporter_getRigidBodyByName(swigCPtr, this, name), false);
}

  public btTypedConstraint getConstraintByName(String name) {
    long cPtr = ExtrasJNI.btWorldImporter_getConstraintByName(swigCPtr, this, name);
    return (cPtr == 0) ? null : new btTypedConstraint(cPtr, false);
  }

  public String getNameForPointer(long ptr) {
    return ExtrasJNI.btWorldImporter_getNameForPointer__SWIG_0(swigCPtr, this, ptr);
  }

  public void setDynamicsWorldInfo(Vector3 gravity, btContactSolverInfo solverInfo) {
    ExtrasJNI.btWorldImporter_setDynamicsWorldInfo(swigCPtr, this, gravity, btContactSolverInfo.getCPtr(solverInfo), solverInfo);
  }

  public btRigidBody createRigidBody(boolean isDynamic, float mass, Matrix4 startTransform, btCollisionShape shape, String bodyName) {
	return btRigidBody.getInstance(ExtrasJNI.btWorldImporter_createRigidBody(swigCPtr, this, isDynamic, mass, startTransform, btCollisionShape.getCPtr(shape), shape, bodyName), false);
}

  public btCollisionObject createCollisionObject(Matrix4 startTransform, btCollisionShape shape, String bodyName) {
	return btCollisionObject.getInstance(ExtrasJNI.btWorldImporter_createCollisionObject(swigCPtr, this, startTransform, btCollisionShape.getCPtr(shape), shape, bodyName), false);
}

  public btCollisionShape createPlaneShape(Vector3 planeNormal, float planeConstant) {
    long cPtr = ExtrasJNI.btWorldImporter_createPlaneShape(swigCPtr, this, planeNormal, planeConstant);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public btCollisionShape createBoxShape(Vector3 halfExtents) {
    long cPtr = ExtrasJNI.btWorldImporter_createBoxShape(swigCPtr, this, halfExtents);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public btCollisionShape createSphereShape(float radius) {
    long cPtr = ExtrasJNI.btWorldImporter_createSphereShape(swigCPtr, this, radius);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public btCollisionShape createCapsuleShapeX(float radius, float height) {
    long cPtr = ExtrasJNI.btWorldImporter_createCapsuleShapeX(swigCPtr, this, radius, height);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public btCollisionShape createCapsuleShapeY(float radius, float height) {
    long cPtr = ExtrasJNI.btWorldImporter_createCapsuleShapeY(swigCPtr, this, radius, height);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public btCollisionShape createCapsuleShapeZ(float radius, float height) {
    long cPtr = ExtrasJNI.btWorldImporter_createCapsuleShapeZ(swigCPtr, this, radius, height);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public btCollisionShape createCylinderShapeX(float radius, float height) {
    long cPtr = ExtrasJNI.btWorldImporter_createCylinderShapeX(swigCPtr, this, radius, height);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public btCollisionShape createCylinderShapeY(float radius, float height) {
    long cPtr = ExtrasJNI.btWorldImporter_createCylinderShapeY(swigCPtr, this, radius, height);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public btCollisionShape createCylinderShapeZ(float radius, float height) {
    long cPtr = ExtrasJNI.btWorldImporter_createCylinderShapeZ(swigCPtr, this, radius, height);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public btTriangleIndexVertexArray createTriangleMeshContainer() {
    long cPtr = ExtrasJNI.btWorldImporter_createTriangleMeshContainer(swigCPtr, this);
    return (cPtr == 0) ? null : new btTriangleIndexVertexArray(cPtr, false);
  }

  public btBvhTriangleMeshShape createBvhTriangleMeshShape(btStridingMeshInterface trimesh, btOptimizedBvh bvh) {
    long cPtr = ExtrasJNI.btWorldImporter_createBvhTriangleMeshShape(swigCPtr, this, btStridingMeshInterface.getCPtr(trimesh), trimesh, btOptimizedBvh.getCPtr(bvh), bvh);
    return (cPtr == 0) ? null : new btBvhTriangleMeshShape(cPtr, false);
  }

  public btCollisionShape createConvexTriangleMeshShape(btStridingMeshInterface trimesh) {
    long cPtr = ExtrasJNI.btWorldImporter_createConvexTriangleMeshShape(swigCPtr, this, btStridingMeshInterface.getCPtr(trimesh), trimesh);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public btGImpactMeshShape createGimpactShape(btStridingMeshInterface trimesh) {
    long cPtr = ExtrasJNI.btWorldImporter_createGimpactShape(swigCPtr, this, btStridingMeshInterface.getCPtr(trimesh), trimesh);
    return (cPtr == 0) ? null : new btGImpactMeshShape(cPtr, false);
  }

  public btStridingMeshInterfaceData createStridingMeshInterfaceData(btStridingMeshInterfaceData interfaceData) {
    long cPtr = ExtrasJNI.btWorldImporter_createStridingMeshInterfaceData(swigCPtr, this, btStridingMeshInterfaceData.getCPtr(interfaceData), interfaceData);
    return (cPtr == 0) ? null : new btStridingMeshInterfaceData(cPtr, false);
  }

  public btConvexHullShape createConvexHullShape() {
    long cPtr = ExtrasJNI.btWorldImporter_createConvexHullShape(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexHullShape(cPtr, false);
  }

  public btCompoundShape createCompoundShape() {
    long cPtr = ExtrasJNI.btWorldImporter_createCompoundShape(swigCPtr, this);
    return (cPtr == 0) ? null : new btCompoundShape(cPtr, false);
  }

  public btScaledBvhTriangleMeshShape createScaledTrangleMeshShape(btBvhTriangleMeshShape meshShape, Vector3 localScalingbtBvhTriangleMeshShape) {
    long cPtr = ExtrasJNI.btWorldImporter_createScaledTrangleMeshShape(swigCPtr, this, btBvhTriangleMeshShape.getCPtr(meshShape), meshShape, localScalingbtBvhTriangleMeshShape);
    return (cPtr == 0) ? null : new btScaledBvhTriangleMeshShape(cPtr, false);
  }

  public btMultiSphereShape createMultiSphereShape(btVector3 positions, java.nio.FloatBuffer radi, int numSpheres) {
    assert radi.isDirect() : "Buffer must be allocated direct.";
    {
      long cPtr = ExtrasJNI.btWorldImporter_createMultiSphereShape(swigCPtr, this, btVector3.getCPtr(positions), positions, radi, numSpheres);
      return (cPtr == 0) ? null : new btMultiSphereShape(cPtr, false);
    }
  }

  public btTriangleIndexVertexArray createMeshInterface(btStridingMeshInterfaceData meshData) {
    long cPtr = ExtrasJNI.btWorldImporter_createMeshInterface(swigCPtr, this, btStridingMeshInterfaceData.getCPtr(meshData), meshData);
    return (cPtr == 0) ? null : new btTriangleIndexVertexArray(cPtr, false);
  }

  public btOptimizedBvh createOptimizedBvh() {
    long cPtr = ExtrasJNI.btWorldImporter_createOptimizedBvh(swigCPtr, this);
    return (cPtr == 0) ? null : new btOptimizedBvh(cPtr, false);
  }

  public btTriangleInfoMap createTriangleInfoMap() {
    long cPtr = ExtrasJNI.btWorldImporter_createTriangleInfoMap(swigCPtr, this);
    return (cPtr == 0) ? null : new btTriangleInfoMap(cPtr, false);
  }

  public btPoint2PointConstraint createPoint2PointConstraint(btRigidBody rbA, btRigidBody rbB, Vector3 pivotInA, Vector3 pivotInB) {
    long cPtr = ExtrasJNI.btWorldImporter_createPoint2PointConstraint__SWIG_0(swigCPtr, this, btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, pivotInA, pivotInB);
    return (cPtr == 0) ? null : new btPoint2PointConstraint(cPtr, false);
  }

  public btPoint2PointConstraint createPoint2PointConstraint(btRigidBody rbA, Vector3 pivotInA) {
    long cPtr = ExtrasJNI.btWorldImporter_createPoint2PointConstraint__SWIG_1(swigCPtr, this, btRigidBody.getCPtr(rbA), rbA, pivotInA);
    return (cPtr == 0) ? null : new btPoint2PointConstraint(cPtr, false);
  }

  public btHingeConstraint createHingeConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame, boolean useReferenceFrameA) {
    long cPtr = ExtrasJNI.btWorldImporter_createHingeConstraint__SWIG_0(swigCPtr, this, btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, rbAFrame, rbBFrame, useReferenceFrameA);
    return (cPtr == 0) ? null : new btHingeConstraint(cPtr, false);
  }

  public btHingeConstraint createHingeConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame) {
    long cPtr = ExtrasJNI.btWorldImporter_createHingeConstraint__SWIG_1(swigCPtr, this, btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, rbAFrame, rbBFrame);
    return (cPtr == 0) ? null : new btHingeConstraint(cPtr, false);
  }

  public btHingeConstraint createHingeConstraint(btRigidBody rbA, Matrix4 rbAFrame, boolean useReferenceFrameA) {
    long cPtr = ExtrasJNI.btWorldImporter_createHingeConstraint__SWIG_2(swigCPtr, this, btRigidBody.getCPtr(rbA), rbA, rbAFrame, useReferenceFrameA);
    return (cPtr == 0) ? null : new btHingeConstraint(cPtr, false);
  }

  public btHingeConstraint createHingeConstraint(btRigidBody rbA, Matrix4 rbAFrame) {
    long cPtr = ExtrasJNI.btWorldImporter_createHingeConstraint__SWIG_3(swigCPtr, this, btRigidBody.getCPtr(rbA), rbA, rbAFrame);
    return (cPtr == 0) ? null : new btHingeConstraint(cPtr, false);
  }

  public btConeTwistConstraint createConeTwistConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame) {
    long cPtr = ExtrasJNI.btWorldImporter_createConeTwistConstraint__SWIG_0(swigCPtr, this, btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, rbAFrame, rbBFrame);
    return (cPtr == 0) ? null : new btConeTwistConstraint(cPtr, false);
  }

  public btConeTwistConstraint createConeTwistConstraint(btRigidBody rbA, Matrix4 rbAFrame) {
    long cPtr = ExtrasJNI.btWorldImporter_createConeTwistConstraint__SWIG_1(swigCPtr, this, btRigidBody.getCPtr(rbA), rbA, rbAFrame);
    return (cPtr == 0) ? null : new btConeTwistConstraint(cPtr, false);
  }

  public btGeneric6DofConstraint createGeneric6DofConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 frameInA, Matrix4 frameInB, boolean useLinearReferenceFrameA) {
    long cPtr = ExtrasJNI.btWorldImporter_createGeneric6DofConstraint__SWIG_0(swigCPtr, this, btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, frameInA, frameInB, useLinearReferenceFrameA);
    return (cPtr == 0) ? null : new btGeneric6DofConstraint(cPtr, false);
  }

  public btGeneric6DofConstraint createGeneric6DofConstraint(btRigidBody rbB, Matrix4 frameInB, boolean useLinearReferenceFrameB) {
    long cPtr = ExtrasJNI.btWorldImporter_createGeneric6DofConstraint__SWIG_1(swigCPtr, this, btRigidBody.getCPtr(rbB), rbB, frameInB, useLinearReferenceFrameB);
    return (cPtr == 0) ? null : new btGeneric6DofConstraint(cPtr, false);
  }

  public btGeneric6DofSpringConstraint createGeneric6DofSpringConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 frameInA, Matrix4 frameInB, boolean useLinearReferenceFrameA) {
    long cPtr = ExtrasJNI.btWorldImporter_createGeneric6DofSpringConstraint(swigCPtr, this, btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, frameInA, frameInB, useLinearReferenceFrameA);
    return (cPtr == 0) ? null : new btGeneric6DofSpringConstraint(cPtr, false);
  }

  public btSliderConstraint createSliderConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 frameInA, Matrix4 frameInB, boolean useLinearReferenceFrameA) {
    long cPtr = ExtrasJNI.btWorldImporter_createSliderConstraint__SWIG_0(swigCPtr, this, btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, frameInA, frameInB, useLinearReferenceFrameA);
    return (cPtr == 0) ? null : new btSliderConstraint(cPtr, false);
  }

  public btSliderConstraint createSliderConstraint(btRigidBody rbB, Matrix4 frameInB, boolean useLinearReferenceFrameA) {
    long cPtr = ExtrasJNI.btWorldImporter_createSliderConstraint__SWIG_1(swigCPtr, this, btRigidBody.getCPtr(rbB), rbB, frameInB, useLinearReferenceFrameA);
    return (cPtr == 0) ? null : new btSliderConstraint(cPtr, false);
  }

}