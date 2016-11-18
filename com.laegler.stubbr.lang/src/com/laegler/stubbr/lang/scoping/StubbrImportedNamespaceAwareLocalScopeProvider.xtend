package com.laegler.stubbr.lang.scoping

import com.google.common.collect.Lists
import com.laegler.stubbr.lang.ext.model.maven.v4_0_0.Model
import java.util.Collections
import java.util.List
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.eclipse.xtext.util.Strings

class StubbrImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

	@Inject
	// Has to be repeated because it's private in ImportedNamespaceAwareLocalScopeProvider and no getQualifiedNameConverter() :(
	// @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=409003
	private IQualifiedNameConverter nameConverter

	/**
	 * We override this because in our grammar, the importedNamespace is of type EPackage instead of a String.
	 */
	protected override List<ImportNormalizer> internalGetImportedNamespaceResolvers(EObject context,boolean ignoreCase) {
		if (!(context instanceof Model))
			return Collections.emptyList
		val Model model = context as Model
		val List<ImportNormalizer> importedNamespaceResolvers = Lists.newArrayList()

//		for (Import anImport : model.getImports()) {
			// We CANNOT do this here: 
			// EPackage ePackage = anImport.getImportedEPackage()
			// QualifiedName packageQN = getQualifiedNameProvider().getFullyQualifiedName(ePackage)
			// String packageName = nameConverter.toString(packageQN)
			// because that would lead to a ""Cyclic resolution of lazy links".. so, instead:
//			val List<INode> nodes = NodeModelUtils.findNodesForFeature(anImport,
//				StubbrLangPackage.Literals.IMPORT__IMPORTED_EPACKAGE)
//			val INode node = nodes.get(0)
//			val String packageName = NodeModelUtils.getTokenText(node)
//			importedNamespaceResolvers.add(createImportedNamespaceResolver(packageName, ignoreCase))
//		}
		return importedNamespaceResolvers
	}

	/**
	 * We override this because in our grammar, the trailing .* isn't part of the rule, so that we can use a reference.  
	 */
	protected override ImportNormalizer createImportedNamespaceResolver(String namespace, boolean ignoreCase) {
		if (Strings.isEmpty(namespace))
			return null
		val QualifiedName importedNamespace = nameConverter.toQualifiedName(namespace)
		if (importedNamespace == null || importedNamespace.getSegmentCount() < 1) {
			return null
		}
		// We know our language has a wildcard, but it's in the Grammar (not in Rule)
		// instead of being part of the namespace String, so this can be simplified, 
		// and should not use skipLast(1)
		return doCreateImportNormalizer(importedNamespace, true, ignoreCase)
	}

}
