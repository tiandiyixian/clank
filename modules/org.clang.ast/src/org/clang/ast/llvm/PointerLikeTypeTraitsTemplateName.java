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

package org.clang.ast.llvm;

import org.clank.support.*;
import org.clang.ast.*;


/// \brief The clang::TemplateName class is effectively a pointer.
//<editor-fold defaultstate="collapsed" desc="llvm::PointerLikeTypeTraits<clang::TemplateName>">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/tools/clang/include/clang/AST/TemplateName.h", line = 517,
 FQN="llvm::PointerLikeTypeTraits<clang::TemplateName>", NM="_ZN4llvm21PointerLikeTypeTraitsIN5clang12TemplateNameEEE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/TemplateName.cpp -nm=_ZN4llvm21PointerLikeTypeTraitsIN5clang12TemplateNameEEE")
//</editor-fold>
public class PointerLikeTypeTraitsTemplateName {
/*public:*/
  //<editor-fold defaultstate="collapsed" desc="llvm::PointerLikeTypeTraits<clang::TemplateName>::getAsVoidPointer">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/AST/TemplateName.h", line = 520,
   FQN="llvm::PointerLikeTypeTraits<clang::TemplateName>::getAsVoidPointer", NM="_ZN4llvm21PointerLikeTypeTraitsIN5clang12TemplateNameEE16getAsVoidPointerES2_",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/TemplateName.cpp -nm=_ZN4llvm21PointerLikeTypeTraitsIN5clang12TemplateNameEE16getAsVoidPointerES2_")
  //</editor-fold>
  public static /*inline*/ Object/*void P*/ getAsVoidPointer(TemplateName TN) {
    return TN.getAsVoidPointer();
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::PointerLikeTypeTraits<clang::TemplateName>::getFromVoidPointer">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/AST/TemplateName.h", line = 524,
   FQN="llvm::PointerLikeTypeTraits<clang::TemplateName>::getFromVoidPointer", NM="_ZN4llvm21PointerLikeTypeTraitsIN5clang12TemplateNameEE18getFromVoidPointerEPv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/TemplateName.cpp -nm=_ZN4llvm21PointerLikeTypeTraitsIN5clang12TemplateNameEE18getFromVoidPointerEPv")
  //</editor-fold>
  public static /*inline*/ TemplateName getFromVoidPointer(Object/*void P*/ Ptr) {
    return TemplateName.getFromVoidPointer(Ptr);
  }

  
  // No bits are available!
  //<editor-fold defaultstate="collapsed" desc="llvm::PointerLikeTypeTraits<clang::TemplateName>::(anonymous)">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/AST/TemplateName.h", line = 529,
   FQN="llvm::PointerLikeTypeTraits<clang::TemplateName>::(anonymous)", NM="_ZN4llvm21PointerLikeTypeTraitsIN5clang12TemplateNameEEE_Unnamed_enum",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/TemplateName.cpp -nm=_ZN4llvm21PointerLikeTypeTraitsIN5clang12TemplateNameEEE_Unnamed_enum")
  //</editor-fold>
  /*enum ANONYMOUS_INT_CONSTANTS {*/
    public static final /*uint*/int NumLowBitsAvailable = 0;
  /*}*/;
  
  @Override public String toString() {
    return ""; // NOI18N
  }
}
