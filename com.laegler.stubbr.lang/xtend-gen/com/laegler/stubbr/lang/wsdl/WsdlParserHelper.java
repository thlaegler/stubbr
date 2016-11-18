package com.laegler.stubbr.lang.wsdl;

import com.google.common.base.Objects;
import io.swagger.models.Swagger;
import java.io.File;
import java.util.logging.Logger;
import javax.inject.Inject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class WsdlParserHelper {
  @Inject
  private Logger log;
  
  public Swagger parse(final String specFile) {
    Object _xblockexpression = null;
    {
      String _replaceAll = specFile.replaceAll("%22", "");
      String _replaceAll_1 = _replaceAll.replaceAll("\"", "");
      final File file = this.findFile(_replaceAll_1);
      _xblockexpression = null;
    }
    return ((Swagger)_xblockexpression);
  }
  
  public File findFile(final String specFile) {
    Object _xblockexpression = null;
    {
      IWorkspace _workspace = ResourcesPlugin.getWorkspace();
      final IWorkspaceRoot root = _workspace.getRoot();
      IProject[] _projects = root.getProjects();
      for (final IProject project : _projects) {
        try {
          System.out.println(project);
          final IFile file = project.getFile(specFile);
          boolean _notEquals = (!Objects.equal(file, null));
          if (_notEquals) {
            IPath _location = file.getLocation();
            return _location.toFile();
          }
        } catch (final Throwable _t) {
          if (_t instanceof CoreException) {
            final CoreException e = (CoreException)_t;
            e.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
      _xblockexpression = null;
    }
    return ((File)_xblockexpression);
  }
}
