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

package org.clang.codegen.impl;

import org.clang.ast.*;
import org.clang.ast.java.*;
import org.clang.basic.*;
import org.clang.codegen.CodeGen.impl.*;
import org.clank.support.*;
import static org.clank.support.Native.$AddrOf;
import static org.clank.support.Native.$Deref;

/// Lexical scope for OpenMP executable constructs, that handles correct codegen
/// for captured expressions.
//<editor-fold defaultstate="collapsed" desc="(anonymous namespace)::OMPLexicalScope">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/tools/clang/lib/CodeGen/CGStmtOpenMP.cpp", line = 29,
 FQN="(anonymous namespace)::OMPLexicalScope", NM="_ZN12_GLOBAL__N_115OMPLexicalScopeE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.codegen/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/CodeGen/CGStmtOpenMP.cpp -nm=_ZN12_GLOBAL__N_115OMPLexicalScopeE")
//</editor-fold>
public final class OMPLexicalScope extends /*public*/ CodeGenFunction.LexicalScope implements Destructors.ClassWithDestructor {
  //<editor-fold defaultstate="collapsed" desc="(anonymous namespace)::OMPLexicalScope::emitPreInitStmt">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/CodeGen/CGStmtOpenMP.cpp", line = 30,
   FQN="(anonymous namespace)::OMPLexicalScope::emitPreInitStmt", NM="_ZN12_GLOBAL__N_115OMPLexicalScope15emitPreInitStmtERN5clang7CodeGen15CodeGenFunctionERKNS1_22OMPExecutableDirectiveE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.codegen/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/CodeGen/CGStmtOpenMP.cpp -nm=_ZN12_GLOBAL__N_115OMPLexicalScope15emitPreInitStmtERN5clang7CodeGen15CodeGenFunctionERKNS1_22OMPExecutableDirectiveE")
  //</editor-fold>
  private void emitPreInitStmt(final CodeGenFunction /*&*/ CGF, final /*const*/ OMPExecutableDirective /*&*/ S) {
    for (/*const*/ OMPClause /*P*/ C : S.clauses$Const()) {
      {
        /*const*/ OMPClauseWithPreInit /*P*/ CPI = OMPClauseWithPreInit.get_OMPClause$C$P(C);
        if ((CPI != null)) {
          {
            /*const*/ DeclStmt /*P*/ PreInit = AstStatementsRTTI.cast_or_null_DeclStmt(CPI.getPreInitStmt$Const());
            if ((PreInit != null)) {
              for (/*const*/ Decl /*P*/ I : PreInit.decls$Const()) {
                if (!I.hasAttr(OMPCaptureNoInitAttr.class)) {
                  CGF.EmitVarDecl(AstDeclarationsRTTI.cast_VarDecl($Deref(I)));
                } else {
                  CodeGenFunction.AutoVarEmission Emission = CGF.EmitAutoVarAlloca(AstDeclarationsRTTI.cast_VarDecl(/*Deref*/I));
                  CGF.EmitAutoVarCleanups(Emission);
                }
              }
            }
          }
        }
      }
    }
  }

  private CodeGenFunction.OMPPrivateScope InlinedShareds;
  
  //<editor-fold defaultstate="collapsed" desc="(anonymous namespace)::OMPLexicalScope::isCapturedVar">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/CodeGen/CGStmtOpenMP.cpp", line = 49,
   FQN="(anonymous namespace)::OMPLexicalScope::isCapturedVar", NM="_ZN12_GLOBAL__N_115OMPLexicalScope13isCapturedVarERN5clang7CodeGen15CodeGenFunctionEPKNS1_7VarDeclE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.codegen/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/CodeGen/CGStmtOpenMP.cpp -nm=_ZN12_GLOBAL__N_115OMPLexicalScope13isCapturedVarERN5clang7CodeGen15CodeGenFunctionEPKNS1_7VarDeclE")
  //</editor-fold>
  private static boolean isCapturedVar(final CodeGenFunction /*&*/ CGF, /*const*/ VarDecl /*P*/ VD) {
    return (CGF.LambdaCaptureFields.lookup(VD) != null)
       || ((CGF.CapturedStmtInfo != null) && (CGF.CapturedStmtInfo.lookup(VD) != null))
       || ((CGF.CurCodeDecl != null) && AstDeclarationsRTTI.isa_BlockDecl(CGF.CurCodeDecl));
  }

/*public:*/
  //<editor-fold defaultstate="collapsed" desc="(anonymous namespace)::OMPLexicalScope::OMPLexicalScope">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/CodeGen/CGStmtOpenMP.cpp", line = 56,
   FQN="(anonymous namespace)::OMPLexicalScope::OMPLexicalScope", NM="_ZN12_GLOBAL__N_115OMPLexicalScopeC1ERN5clang7CodeGen15CodeGenFunctionERKNS1_22OMPExecutableDirectiveEb",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.codegen/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/CodeGen/CGStmtOpenMP.cpp -nm=_ZN12_GLOBAL__N_115OMPLexicalScopeC1ERN5clang7CodeGen15CodeGenFunctionERKNS1_22OMPExecutableDirectiveEb")
  //</editor-fold>
  public OMPLexicalScope(final CodeGenFunction /*&*/ CGF, final /*const*/ OMPExecutableDirective /*&*/ S) {
    this(CGF, S, 
      false);
  }
  public OMPLexicalScope(final CodeGenFunction /*&*/ CGF, final /*const*/ OMPExecutableDirective /*&*/ S, 
      boolean AsInlined/*= false*/) {
    // : CodeGenFunction::LexicalScope(CGF, S.getSourceRange()), InlinedShareds(CGF) 
    //START JInit
    /*ExprWithCleanups*/super(CGF, S.getSourceRange());
    this.InlinedShareds = new CodeGenFunction.OMPPrivateScope(CGF);
    //END JInit
    emitPreInitStmt(CGF, S);
    if (AsInlined) {
      if (S.hasAssociatedStmt()) {
        CapturedStmt /*P*/ CS = AstStatementsRTTI.cast_CapturedStmt(S.getAssociatedStmt());
        for (final CapturedStmt.Capture /*&*/ C : CS.captures()) {
          if (C.capturesVariable() || C.capturesVariableByCopy()) {
            VarDecl /*P*/ VD = C.getCapturedVar();
            DeclRefExpr DRE/*J*/= new DeclRefExpr(((/*const_cast*/VarDecl /*P*/ )(VD)), 
                OMPLexicalScope.isCapturedVar(CGF, VD)
                   || ((CGF.CapturedStmtInfo != null)
                   && InlinedShareds.isGlobalVarCaptured(VD)), 
                VD.getType().getNonReferenceType(), ExprValueKind.VK_LValue, 
                new SourceLocation());
            InlinedShareds.addPrivate(VD, /*FuncArg*//*[&CGF, &DRE]*/ () -> {
                      return CGF.EmitLValue($AddrOf(DRE)).getAddress();
                    });
          }
        }
        /*J:(void)*/InlinedShareds.Privatize();
      }
    }
  }

  //<editor-fold defaultstate="collapsed" desc="(anonymous namespace)::OMPLexicalScope::~OMPLexicalScope">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/CodeGen/CGStmtOpenMP.cpp", line = 29,
   FQN="(anonymous namespace)::OMPLexicalScope::~OMPLexicalScope", NM="_ZN12_GLOBAL__N_115OMPLexicalScopeD0Ev",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.codegen/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/CodeGen/CGStmtOpenMP.cpp -nm=_ZN12_GLOBAL__N_115OMPLexicalScopeD0Ev")
  //</editor-fold>
  public /*inline*/ void $destroy_OMPLexicalScope() {
    //START JDestroy
    InlinedShareds.$destroy();
    super.$destroy();
    //END JDestroy
  }

  
  @Override public String toString() {
    return "" + "InlinedShareds=" + InlinedShareds // NOI18N
              + super.toString(); // NOI18N
  }
}
