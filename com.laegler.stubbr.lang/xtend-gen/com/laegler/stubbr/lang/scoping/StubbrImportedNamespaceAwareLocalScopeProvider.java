package com.laegler.stubbr.lang.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.laegler.stubbr.lang.ext.model.maven.v4_0_0.Model;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.util.Strings;

@SuppressWarnings("all")
public class StubbrImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Inject
  private IQualifiedNameConverter nameConverter;
  
  /**
   * We override this because in our grammar, the importedNamespace is of type EPackage instead of a String.
   */
  @Override
  protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
    if ((!(context instanceof Model))) {
      return Collections.<ImportNormalizer>emptyList();
    }
    final Model model = ((Model) context);
    final List<ImportNormalizer> importedNamespaceResolvers = Lists.<ImportNormalizer>newArrayList();
    return importedNamespaceResolvers;
  }
  
  /**
   * We override this because in our grammar, the trailing .* isn't part of the rule, so that we can use a reference.
   */
  @Override
  protected ImportNormalizer createImportedNamespaceResolver(final String namespace, final boolean ignoreCase) {
    boolean _isEmpty = Strings.isEmpty(namespace);
    if (_isEmpty) {
      return null;
    }
    final QualifiedName importedNamespace = this.nameConverter.toQualifiedName(namespace);
    if ((Objects.equal(importedNamespace, null) || (importedNamespace.getSegmentCount() < 1))) {
      return null;
    }
    return this.doCreateImportNormalizer(importedNamespace, true, ignoreCase);
  }
}
