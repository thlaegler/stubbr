package com.laegler.stubbr.lang.genmodel;

import com.google.common.base.Objects;
import com.laegler.stubbr.lang.genmodel.FileHelper;
import com.laegler.stubbr.lang.genmodel.OverwritePolicy;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import java.io.File;
import java.util.logging.Logger;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import templates.AbstractTemplate;

@SuppressWarnings("all")
public class TemplateProvider {
  @Inject
  protected Logger log;
  
  @Inject
  protected StubbrRegistry stubbr;
  
  @Inject
  protected FileHelper fileHelper;
  
  public boolean generateFile(final AbstractTemplate template) {
    boolean _xblockexpression = false;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Try to generate file from ");
      String _fullPathWithName = template.getFullPathWithName();
      _builder.append(_fullPathWithName, "");
      this.log.info(_builder.toString());
      OverwritePolicy _overwritePolicy = template.getOverwritePolicy();
      boolean _notEquals = (!Objects.equal(_overwritePolicy, OverwritePolicy.OVERWRITE));
      if (_notEquals) {
        String _fullPathWithName_1 = template.getFullPathWithName();
        final File file = this.fileHelper.findFile(_fullPathWithName_1);
        boolean _notEquals_1 = (!Objects.equal(file, null));
        if (_notEquals_1) {
          String _fileContent = this.fileHelper.getFileContent(file);
          String _fileContent_1 = template.getFileContent();
          boolean _equalsIgnoreCase = _fileContent.equalsIgnoreCase(_fileContent_1);
          if (_equalsIgnoreCase) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("No changes in file so we skip generation and keep the old version for file ");
            String _fullPathWithName_2 = template.getFullPathWithName();
            _builder_1.append(_fullPathWithName_2, "");
            this.log.info(_builder_1.toString());
            return false;
          }
          final String fileVersion = this.fileHelper.getFileVersion(file);
          String _version = template.getVersion();
          final int versionCompare = this.fileHelper.versionCompare(fileVersion, _version);
          if ((versionCompare > 0)) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("Version is older than the existing version for file ");
            String _fullPathWithName_3 = template.getFullPathWithName();
            _builder_2.append(_fullPathWithName_3, "");
            this.log.info(_builder_2.toString());
            return false;
          }
        }
      }
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("Generating file ");
      String _fullPathWithName_4 = template.getFullPathWithName();
      _builder_3.append(_fullPathWithName_4, "");
      this.log.info(_builder_3.toString());
      IFileSystemAccess _fsa = this.stubbr.getFsa();
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("../");
      String _fullPathWithName_5 = template.getFullPathWithName();
      _builder_4.append(_fullPathWithName_5, "");
      String _fileContent_2 = template.getFileContent();
      _fsa.generateFile(_builder_4.toString(), _fileContent_2);
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("Successfully generated file ");
      String _fullPathWithName_6 = template.getFullPathWithName();
      _builder_5.append(_fullPathWithName_6, "");
      this.log.info(_builder_5.toString());
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
}
