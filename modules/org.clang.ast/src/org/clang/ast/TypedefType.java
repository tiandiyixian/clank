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

package org.clang.ast;

import org.clank.support.*;
import static org.clang.ast.java.AstTypesRTTI.*;
//<editor-fold defaultstate="collapsed" desc="clang::TypedefType">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/tools/clang/include/clang/AST/Type.h", line = 3502,
 FQN="clang::TypedefType", NM="_ZN5clang11TypedefTypeE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/Type.cpp -nm=_ZN5clang11TypedefTypeE")
//</editor-fold>
public class TypedefType extends /*public*/ Type {
  private TypedefNameDecl /*P*/ Decl;
/*protected:*/
  //<editor-fold defaultstate="collapsed" desc="clang::TypedefType::TypedefType">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/AST/Type.h", line = 3505,
   FQN="clang::TypedefType::TypedefType", NM="_ZN5clang11TypedefTypeC1ENS_4Type9TypeClassEPKNS_15TypedefNameDeclENS_8QualTypeE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/Type.cpp -nm=_ZN5clang11TypedefTypeC1ENS_4Type9TypeClassEPKNS_15TypedefNameDeclENS_8QualTypeE")
  //</editor-fold>
  protected TypedefType(TypeClass tc, /*const*/ TypedefNameDecl /*P*/ D, QualType can) {
    // : Type(tc, can, can->isDependentType(), can->isInstantiationDependentType(), can->isVariablyModifiedType(), /*ContainsUnexpandedParameterPack=*/ false), Decl(const_cast<TypedefNameDecl * >(D)) 
    //START JInit
    super(tc, new QualType(can), can.$arrow().isDependentType(), 
        can.$arrow().isInstantiationDependentType(), 
        can.$arrow().isVariablyModifiedType(), 
        false);
    this.Decl = ((/*const_cast*/TypedefNameDecl /*P*/ )(D));
    //END JInit
    assert (!isa_TypedefType(can)) : "Invalid canonical type";
  }

  /*friend  class ASTContext*/ // ASTContext creates these.
/*public:*/
  
  //<editor-fold defaultstate="collapsed" desc="clang::TypedefType::getDecl">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/AST/Type.h", line = 3516,
   FQN="clang::TypedefType::getDecl", NM="_ZNK5clang11TypedefType7getDeclEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/Type.cpp -nm=_ZNK5clang11TypedefType7getDeclEv")
  //</editor-fold>
  public TypedefNameDecl /*P*/ getDecl() /*const*/ {
    return Decl;
  }

  
  //<editor-fold defaultstate="collapsed" desc="clang::TypedefType::isSugared">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/AST/Type.h", line = 3518,
   FQN="clang::TypedefType::isSugared", NM="_ZNK5clang11TypedefType9isSugaredEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/Type.cpp -nm=_ZNK5clang11TypedefType9isSugaredEv")
  //</editor-fold>
  public boolean isSugared() /*const*/ {
    return true;
  }

  //<editor-fold defaultstate="collapsed" desc="clang::TypedefType::desugar">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/AST/Type.cpp", line = 2869,
   FQN="clang::TypedefType::desugar", NM="_ZNK5clang11TypedefType7desugarEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/Type.cpp -nm=_ZNK5clang11TypedefType7desugarEv")
  //</editor-fold>
  public QualType desugar() /*const*/ {
    return getDecl().getUnderlyingType();
  }

  
  //<editor-fold defaultstate="collapsed" desc="clang::TypedefType::classof">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/AST/Type.h", line = 3521,
   FQN="clang::TypedefType::classof", NM="_ZN5clang11TypedefType7classofEPKNS_4TypeE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/Type.cpp -nm=_ZN5clang11TypedefType7classofEPKNS_4TypeE")
  //</editor-fold>
  public static boolean classof(/*const*/ Type /*P*/ T) {
    return T.getTypeClass() == TypeClass.Typedef;
  }

  @Override public String toString() {
    return "" + "Decl=" + Decl // NOI18N
              + super.toString(); // NOI18N
  }
}
