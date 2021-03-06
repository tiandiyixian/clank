/**
 * This file was converted to Java from the original LLVM source file. The original
 * source file follows the LLVM Release License, outlined below.
 * 
 * ==============================================================================
 * LLVM Release License
 * ==============================================================================
 * University of Illinois/NCSA
 * Open Source License
 * 
 * Copyright (c) 2003-2017 University of Illinois at Urbana-Champaign.
 * All rights reserved.
 * 
 * Developed by:
 * 
 *     LLVM Team
 * 
 *     University of Illinois at Urbana-Champaign
 * 
 *     http://llvm.org
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal with
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimers.
 * 
 *     * Redistributions in binary form must reproduce the above copyright notice
 *       this list of conditions and the following disclaimers in the
 *       documentation and/or other materials provided with the distribution.
 * 
 *     * Neither the names of the LLVM Team, University of Illinois at
 *       Urbana-Champaign, nor the names of its contributors may be used to
 *       endorse or promote products derived from this Software without specific
 *       prior written permission.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
 * CONTRIBUTORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS WITH THE
 * SOFTWARE.
 * 
 * ==============================================================================
 * Copyrights and Licenses for Third Party Software Distributed with LLVM:
 * ==============================================================================
 * The LLVM software contains code written by third parties.  Such software will
 * have its own individual LICENSE.TXT file in the directory in which it appears.
 * This file will describe the copyrights, license, and restrictions which apply
 * to that code.
 * 
 * The disclaimer of warranty in the University of Illinois Open Source License
 * applies to all code in the LLVM Distribution, and nothing in any of the
 * other licenses gives permission to use the names of the LLVM Team or the
 * University of Illinois to endorse or promote products derived from this
 * Software.
 * 
 * The following pieces of software have additional or alternate copyrights,
 * licenses, and/or restrictions:
 * 
 * Program             Directory
 * -------             ---------
 * Autoconf            llvm/autoconf
 *                     llvm/projects/ModuleMaker/autoconf
 * Google Test         llvm/utils/unittest/googletest
 * OpenBSD regex       llvm/lib/Support/{reg*, COPYRIGHT.regex}
 * pyyaml tests        llvm/test/YAMLParser/{*.data, LICENSE.TXT}
 * ARM contributions   llvm/lib/Target/ARM/LICENSE.TXT
 * md5 contributions   llvm/lib/Support/MD5.cpp llvm/include/llvm/Support/MD5.h
 */

package org.clang.basic.impl;

import org.clank.support.*;
import org.llvm.adt.*;
import org.clang.basic.*;
import org.llvm.support.sys.path;


//<editor-fold defaultstate="collapsed" desc="static type FileManagerStatics">
@Converted(kind = Converted.Kind.AUTO, cmd = "jclank.sh -java-options=${SPUTNIK}/modules/org.clang.basic/llvmToClangType -java-types-map=${SPUTNIK}/contrib/JConvert/llvmToClankType -print ${LLVM_SRC}/llvm/tools/clang/lib/Basic/FileManager.cpp -nm=_ZL20getDirectoryFromFileRN5clang11FileManagerEN4llvm9StringRefEb; -static-type=FileManagerStatics")
//</editor-fold>
public final class FileManagerStatics {


/// \brief Retrieve the directory that the given file name resides in.
/// Filename can point to either a real file or a virtual file.
//<editor-fold defaultstate="collapsed" desc="getDirectoryFromFile">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/tools/clang/lib/Basic/FileManager.cpp", line = 104,
 old_source = "${LLVM_SRC}/llvm/tools/clang/lib/Basic/FileManager.cpp", old_line = 105,
 FQN="getDirectoryFromFile", NM="_ZL20getDirectoryFromFileRN5clang11FileManagerEN4llvm9StringRefEb",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.basic/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Basic/FileManager.cpp -nm=_ZL20getDirectoryFromFileRN5clang11FileManagerEN4llvm9StringRefEb")
//</editor-fold>
public static /*const*/DirectoryEntry /*P*/ getDirectoryFromFile(FileManager /*&*/ FileMgr, StringRef Filename, boolean CacheFailure) {
  if (path.is_empty(Filename)) {
    return null;
  }
  if (path.is_separator(Filename.$at(Filename.size() - 1))) {
    return null;
  }
  // If Filename is a directory.
  StringRef DirName = path.parent_path(Filename);
  // Use the current directory if file has no path component.
  if (path.is_empty(DirName)) {
    DirName.$assign(StringRef.R$DOT);
  }
  
  return FileMgr.getDirectory(DirName, CacheFailure);
}

} // END OF class FileManagerStatics
