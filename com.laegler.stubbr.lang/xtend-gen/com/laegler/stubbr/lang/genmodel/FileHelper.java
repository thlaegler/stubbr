package com.laegler.stubbr.lang.genmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * File helpers with convenience methods.
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 */
@SuppressWarnings("all")
public class FileHelper {
  @Inject
  private Logger log;
  
  /**
   * Get file with given workspace relative path.
   */
  public File findFile(final String fileLocation1) {
    Object _xblockexpression = null;
    {
      String _replaceAll = fileLocation1.replaceAll("%22", "");
      final String fileLocation = _replaceAll.replaceAll("\"", "");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Searching for file: ");
      _builder.append(fileLocation, "");
      this.log.info(_builder.toString());
      IWorkspace _workspace = ResourcesPlugin.getWorkspace();
      final IWorkspaceRoot root = _workspace.getRoot();
      IProject[] _projects = root.getProjects();
      for (final IProject project : _projects) {
        {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Searching for file in project ");
          _builder_1.append(project, "");
          this.log.info(_builder_1.toString());
          final IFile file = project.getFile(fileLocation);
          boolean _notEquals = (!Objects.equal(file, null));
          if (_notEquals) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("File found ");
            _builder_2.append(fileLocation, "");
            this.log.info(_builder_2.toString());
            IPath _location = file.getLocation();
            return _location.toFile();
          }
        }
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("File not found: ");
      _builder_1.append(fileLocation, "");
      _builder_1.append(")");
      this.log.info(_builder_1.toString());
      _xblockexpression = null;
    }
    return ((File)_xblockexpression);
  }
  
  public String getFileContent(final File file) {
    try {
      String _xblockexpression = null;
      {
        String _path = file.getPath();
        Path _get = Paths.get(_path);
        final byte[] encoded = Files.readAllBytes(_get);
        _xblockexpression = new String(encoded, StandardCharsets.UTF_8);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String getFileVersion(final File file) {
    Object _xblockexpression = null;
    {
      final String fileContent = this.getFileContent(file);
      if ((fileContent.contains("{{{Version: ") && fileContent.contains("}}}"))) {
        int _indexOf = fileContent.indexOf("{{{Version: ");
        int _plus = (_indexOf + 1);
        int _indexOf_1 = fileContent.indexOf("}}}");
        final String version = fileContent.substring(_plus, _indexOf_1);
        return version;
      }
      _xblockexpression = null;
    }
    return ((String)_xblockexpression);
  }
  
  /**
   * Compare two versions.
   * 
   * @return The result is a negative integer if str1 is _numerically_ less than str2.
   *         The result is a positive integer if str1 is _numerically_ greater than str2.
   *         The result is zero if the strings are _numerically_ equal.
   */
  public int versionCompare(final String str1, final String str2) {
    final String[] vals1 = str1.split("\\.");
    final String[] vals2 = str2.split("\\.");
    int i = 0;
    while ((((i < vals1.length) && (i < vals2.length)) && vals1[i].equals(vals2[i]))) {
      i++;
    }
    if (((i < vals1.length) && (i < vals2.length))) {
      String _get = vals1[i];
      Integer _valueOf = Integer.valueOf(_get);
      String _get_1 = vals2[i];
      Integer _valueOf_1 = Integer.valueOf(_get_1);
      final int diff = _valueOf.compareTo(_valueOf_1);
      return Integer.signum(diff);
    }
    int _length = vals1.length;
    int _length_1 = vals2.length;
    int _minus = (_length - _length_1);
    return Integer.signum(_minus);
  }
}
