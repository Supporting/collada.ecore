package org.khronos.collada.util;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.util.ColladaResourceFactoryImpl;

public class ColladaResourceUtil {

	public static Resource createResource(URI uri) {
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new ColladaResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put(ColladaPackage.eNS_URI, ColladaPackage.eINSTANCE);
		Resource resource = resourceSet.createResource(uri);
		return resource;
	}
	
	public static Resource loadFile(URI uri, Map<?, ?> options) throws IOException {
		Resource resource = createResource(uri);
		resource.load(options);
		return resource;
	}
	
}
