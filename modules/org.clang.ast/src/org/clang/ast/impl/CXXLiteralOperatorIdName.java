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

package org.clang.ast.impl;

import org.clank.support.*;
import org.llvm.adt.*;
import org.clang.basic.*;


/// CXXLiteralOperatorName - Contains the actual identifier that makes up the
/// name.
///
/// This identifier is stored here rather than directly in DeclarationName so as
/// to allow Objective-C selectors, which are about a million times more common,
/// to consume minimal memory.
//<editor-fold defaultstate="collapsed" desc="clang::CXXLiteralOperatorIdName">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/tools/clang/lib/AST/DeclarationName.cpp", line = 62,
 FQN="clang::CXXLiteralOperatorIdName", NM="_ZN5clang24CXXLiteralOperatorIdNameE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/DeclarationName.cpp -nm=_ZN5clang24CXXLiteralOperatorIdNameE")
//</editor-fold>
public class CXXLiteralOperatorIdName extends /*public*/ DeclarationNameExtra implements /*public*/ FoldingSetImpl.Node {
/*public:*/
  public IdentifierInfo /*P*/ ID;
  
  /// FETokenInfo - Extra information associated with this operator
  /// name that can be used by the front end.
  public Object/*void P*/ FETokenInfo;
  
  //<editor-fold defaultstate="collapsed" desc="clang::CXXLiteralOperatorIdName::Profile">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/AST/DeclarationName.cpp", line = 71,
   FQN="clang::CXXLiteralOperatorIdName::Profile", NM="_ZN5clang24CXXLiteralOperatorIdName7ProfileERN4llvm16FoldingSetNodeIDE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/DeclarationName.cpp -nm=_ZN5clang24CXXLiteralOperatorIdName7ProfileERN4llvm16FoldingSetNodeIDE")
  //</editor-fold>
  public void Profile(final FoldingSetNodeID /*&*/ FSID) {
    FSID.AddPointer(ID);
  }

  //<editor-fold defaultstate="collapsed" desc="clang::CXXLiteralOperatorIdName::CXXLiteralOperatorIdName">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/AST/DeclarationName.cpp", line = 62,
   FQN="clang::CXXLiteralOperatorIdName::CXXLiteralOperatorIdName", NM="_ZN5clang24CXXLiteralOperatorIdNameC1Ev",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/DeclarationName.cpp -nm=_ZN5clang24CXXLiteralOperatorIdNameC1Ev")
  //</editor-fold>
  public /*inline*/ CXXLiteralOperatorIdName() {
    // : DeclarationNameExtra(), FoldingSetNode() 
    //START JInit
    super();
    $Node();
    //END JInit
  }

  
  @Override public String toString() {
    return "" + "ID=" + ID // NOI18N
              + ", FETokenInfo=" + NativeTrace.getIdentityStr(FETokenInfo) // NOI18N
              + super.toString(); // NOI18N
  }
}
