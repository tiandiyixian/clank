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

package org.clang.frontend;

import org.clank.java.*;
import org.clank.support.*;
import org.clank.support.JavaDifferentiators.*;
import static org.clank.support.Native.*;
import org.llvm.support.*;
import org.llvm.adt.*;
import org.clang.ast.*;
import static org.clang.frontend.FrontendClangGlobals.*;
import org.clang.frontend.*;


//===----------------------------------------------------------------------===//
// AST Consumer Actions
//===----------------------------------------------------------------------===//
//<editor-fold defaultstate="collapsed" desc="clang::ASTPrintAction">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/tools/clang/include/clang/Frontend/FrontendActions.h", line = 42,
 FQN="clang::ASTPrintAction", NM="_ZN5clang14ASTPrintActionE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.frontend/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/FrontendTool/ExecuteCompilerInvocation.cpp -nm=_ZN5clang14ASTPrintActionE")
//</editor-fold>
public class ASTPrintAction extends /*public*/ ASTFrontendAction implements Destructors.ClassWithDestructor {
/*protected:*/
  
  //===----------------------------------------------------------------------===//
  // AST Consumer Actions
  //===----------------------------------------------------------------------===//
  //<editor-fold defaultstate="collapsed" desc="clang::ASTPrintAction::CreateASTConsumer">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/Frontend/FrontendActions.cpp", line = 49,
   FQN="clang::ASTPrintAction::CreateASTConsumer", NM="_ZN5clang14ASTPrintAction17CreateASTConsumerERNS_16CompilerInstanceEN4llvm9StringRefE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.frontend/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Frontend/FrontendActions.cpp -nm=_ZN5clang14ASTPrintAction17CreateASTConsumerERNS_16CompilerInstanceEN4llvm9StringRefE")
  //</editor-fold>
  @Override protected std.unique_ptr<ASTConsumer> CreateASTConsumer(CompilerInstance /*&*/ CI, StringRef InFile)/* override*/ {
    JavaCleaner $c$ = $createJavaCleaner();
    try {
      {
        std.unique_ptr<raw_ostream> OS = null;
        try {
          OS = $c$.clean(new std.unique_ptr<raw_ostream>(JD$Unique_ptr$_Up$_Ep.INSTANCE, $c$.track(new std.unique_ptr(CI.createDefaultOutputFile(false, new StringRef(InFile))))));
          if (OS.$bool()) {
            return $c$.clean(CreateASTPrinter($c$.track(new std.unique_ptr<raw_ostream>(JD$Move.INSTANCE, std.move(OS))), new StringRef(CI.getFrontendOpts().ASTDumpFilter)));
          }
        } finally {
          if (OS != null) { OS.$destroy(); }
        }
      }
      return new std.unique_ptr<ASTConsumer>(JD$NullPtr.INSTANCE, null);
    } finally {
      $c$.$destroy();
    }
  }


  //<editor-fold defaultstate="collapsed" desc="clang::ASTPrintAction::~ASTPrintAction">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/Frontend/FrontendActions.h", line = 42,
   FQN="clang::ASTPrintAction::~ASTPrintAction", NM="_ZN5clang14ASTPrintActionD0Ev",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.frontend/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/FrontendTool/ExecuteCompilerInvocation.cpp -nm=_ZN5clang14ASTPrintActionD0Ev")
  //</editor-fold>
  @Override public /*inline*/ void $destroy() {
    super.$destroy();
  }

  //<editor-fold defaultstate="collapsed" desc="clang::ASTPrintAction::ASTPrintAction">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/Frontend/FrontendActions.h", line = 42,
   FQN="clang::ASTPrintAction::ASTPrintAction", NM="_ZN5clang14ASTPrintActionC1Ev",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.frontend/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/FrontendTool/ExecuteCompilerInvocation.cpp -nm=_ZN5clang14ASTPrintActionC1Ev")
  //</editor-fold>
  public /*inline*/ ASTPrintAction() {
    // : ASTFrontendAction() 
    //START JInit
    super();
    //END JInit
  }

  
  @Override public String toString() {
    return "" + super.toString(); // NOI18N
  }
}
