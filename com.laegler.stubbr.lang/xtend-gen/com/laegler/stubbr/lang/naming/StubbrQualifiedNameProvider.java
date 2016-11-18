/**
 * Copyright (c) 2012 - 2016 Signal Iduna Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Signal Iduna Corporation - initial API and implementation
 * akquinet AG
 * Die Techniker AG
 */
package com.laegler.stubbr.lang.naming;

import com.laegler.stubbr.lang.stubbrLang.Stubb;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;

@Singleton
@SuppressWarnings("all")
public class StubbrQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  @Inject
  @Extension
  private IQualifiedNameConverter _iQualifiedNameConverter;
  
  @Override
  public QualifiedName getFullyQualifiedName(final EObject obj) {
    QualifiedName _switchResult = null;
    boolean _matched = false;
    if (obj instanceof Stubb) {
      _matched=true;
      String _name = null;
      if (((Stubb)obj)!=null) {
        _name=((Stubb)obj).getName();
      }
      QualifiedName _qualifiedName = null;
      if (_name!=null) {
        _qualifiedName=this._iQualifiedNameConverter.toQualifiedName(_name);
      }
      _switchResult = _qualifiedName;
    }
    if (!_matched) {
      _switchResult = super.getFullyQualifiedName(obj);
    }
    final QualifiedName result = _switchResult;
    return result;
  }
}
