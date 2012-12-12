/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.khronos.collada.ColladaPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ColladaXMLProcessor extends XMLProcessor {

	/**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColladaXMLProcessor() {
    super((EPackage.Registry.INSTANCE));
    ColladaPackage.eINSTANCE.eClass();
  }
	
	/**
   * Register for "*" and "xml" file extensions the ColladaResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
    if (registrations == null)
    {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new ColladaResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new ColladaResourceFactoryImpl());
    }
    return registrations;
  }

} //ColladaXMLProcessor
