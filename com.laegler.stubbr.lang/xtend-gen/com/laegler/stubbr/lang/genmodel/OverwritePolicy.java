package com.laegler.stubbr.lang.genmodel;

/**
 * Specification of overwrite policy for generating files.
 */
@SuppressWarnings("all")
public enum OverwritePolicy {
  KEEP,
  
  OVERWRITE_IF_OLD_VERSION,
  
  OVERWRITE;
}
