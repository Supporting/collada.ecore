/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.NodeType1#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getLookat <em>Lookat</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getScale <em>Scale</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getSkew <em>Skew</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getTranslate <em>Translate</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getInstanceCamera <em>Instance Camera</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getInstanceController <em>Instance Controller</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getInstanceGeometry <em>Instance Geometry</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getInstanceLight <em>Instance Light</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getInstanceNode <em>Instance Node</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getNode <em>Node</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getSid <em>Sid</em>}</li>
 *   <li>{@link org.khronos.collada.NodeType1#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getNodeType1()
 * @model extendedMetaData="name='node_._type' kind='elementOnly'"
 * @generated
 */
public interface NodeType1 extends EObject {
	/**
   * Returns the value of the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The node element may contain an asset element.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Asset</em>' containment reference.
   * @see #setAsset(AssetType)
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Asset()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
   * @generated
   */
	AssetType getAsset();

	/**
   * Sets the value of the '{@link org.khronos.collada.NodeType1#getAsset <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asset</em>' containment reference.
   * @see #getAsset()
   * @generated
   */
	void setAsset(AssetType value);

	/**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:1'"
   * @generated
   */
	FeatureMap getGroup();

	/**
   * Returns the value of the '<em><b>Lookat</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LookatType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The node element may contain any number of lookat elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Lookat</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Lookat()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='lookat' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LookatType> getLookat();

	/**
   * Returns the value of the '<em><b>Matrix</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.MatrixType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The node element may contain any number of matrix elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Matrix</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Matrix()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='matrix' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<MatrixType> getMatrix();

	/**
   * Returns the value of the '<em><b>Rotate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.RotateType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The node element may contain any number of rotate elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Rotate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Rotate()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='rotate' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<RotateType> getRotate();

	/**
   * Returns the value of the '<em><b>Scale</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TargetableFloat3}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The node element may contain any number of scale elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Scale</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Scale()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='scale' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<TargetableFloat3> getScale();

	/**
   * Returns the value of the '<em><b>Skew</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SkewType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The node element may contain any number of skew elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Skew</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Skew()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='skew' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<SkewType> getSkew();

	/**
   * Returns the value of the '<em><b>Translate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TargetableFloat3}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The node element may contain any number of translate elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Translate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Translate()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='translate' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<TargetableFloat3> getTranslate();

	/**
   * Returns the value of the '<em><b>Instance Camera</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InstanceWithExtra}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The node element may instance any number of camera objects.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Camera</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getNodeType1_InstanceCamera()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_camera' namespace='##targetNamespace'"
   * @generated
   */
	EList<InstanceWithExtra> getInstanceCamera();

	/**
   * Returns the value of the '<em><b>Instance Controller</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InstanceControllerType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The node element may instance any number of controller objects.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Controller</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getNodeType1_InstanceController()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_controller' namespace='##targetNamespace'"
   * @generated
   */
	EList<InstanceControllerType> getInstanceController();

	/**
   * Returns the value of the '<em><b>Instance Geometry</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InstanceGeometryType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The node element may instance any number of geometry objects.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Geometry</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getNodeType1_InstanceGeometry()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_geometry' namespace='##targetNamespace'"
   * @generated
   */
	EList<InstanceGeometryType> getInstanceGeometry();

	/**
   * Returns the value of the '<em><b>Instance Light</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InstanceWithExtra}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The node element may instance any number of light objects.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Light</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getNodeType1_InstanceLight()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_light' namespace='##targetNamespace'"
   * @generated
   */
	EList<InstanceWithExtra> getInstanceLight();

	/**
   * Returns the value of the '<em><b>Instance Node</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InstanceWithExtra}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The node element may instance any number of node elements or hierarchies objects.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Node</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getNodeType1_InstanceNode()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_node' namespace='##targetNamespace'"
   * @generated
   */
	EList<InstanceWithExtra> getInstanceNode();

	/**
   * Returns the value of the '<em><b>Node</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.NodeType1}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The node element may be hierarchical and be the parent of any number of other node elements.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Node</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Node()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='node' namespace='##targetNamespace'"
   * @generated
   */
	EList<NodeType1> getNode();

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The extra element may appear any number of times.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The id attribute is a text string containing the unique identifier of this element. 
   * 					This value must be unique within the instance document. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.NodeType1#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
	void setId(String value);

	/**
   * Returns the value of the '<em><b>Layer</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The layer attribute indicates the names of the layers to which this node belongs.  For example, 
   * 					a value of “foreground glowing” indicates that this node belongs to both the ‘foreground’ layer 
   * 					and the ‘glowing’ layer.  The default value is empty, indicating that the node doesn’t belong to 
   * 					any layer.  Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Layer</em>' attribute.
   * @see #setLayer(List)
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Layer()
   * @model dataType="org.khronos.collada.ListOfNames" many="false"
   *        extendedMetaData="kind='attribute' name='layer'"
   * @generated
   */
	List<String> getLayer();

	/**
   * Sets the value of the '{@link org.khronos.collada.NodeType1#getLayer <em>Layer</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layer</em>' attribute.
   * @see #getLayer()
   * @generated
   */
	void setLayer(List<String> value);

	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The name attribute is the text string name of this element. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.NodeType1#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The sid attribute is a text string value containing the sub-identifier of this element. 
   * 					This value must be unique within the scope of the parent element. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(String)
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Sid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.NodeType1#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

	/**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The default value is <code>"NODE"</code>.
   * The literals are from the enumeration {@link org.khronos.collada.NodeType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The type attribute indicates the type of the node element. The default value is “NODE”. 
   * 					Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.khronos.collada.NodeType
   * @see #isSetType()
   * @see #unsetType()
   * @see #setType(NodeType)
   * @see org.khronos.collada.ColladaPackage#getNodeType1_Type()
   * @model default="NODE" unsettable="true"
   *        extendedMetaData="kind='attribute' name='type'"
   * @generated
   */
	NodeType getType();

	/**
   * Sets the value of the '{@link org.khronos.collada.NodeType1#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.khronos.collada.NodeType
   * @see #isSetType()
   * @see #unsetType()
   * @see #getType()
   * @generated
   */
	void setType(NodeType value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.NodeType1#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetType()
   * @see #getType()
   * @see #setType(NodeType)
   * @generated
   */
	void unsetType();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.NodeType1#getType <em>Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Type</em>' attribute is set.
   * @see #unsetType()
   * @see #getType()
   * @see #setType(NodeType)
   * @generated
   */
	boolean isSetType();

} // NodeType1
