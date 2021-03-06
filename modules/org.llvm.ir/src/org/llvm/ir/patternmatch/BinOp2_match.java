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

package org.llvm.ir.patternmatch;

import org.clank.support.*;
import static org.clank.support.Native.*;
import org.llvm.ir.*;
import static org.llvm.ir.java.IrRTTI.*;
import org.llvm.ir.java.*;


//===----------------------------------------------------------------------===//
// Class that matches two different binary ops.
//
/*template <typename LHS_t, typename RHS_t, unsigned int Opc1, unsigned int Opc2> TEMPLATE*/
//<editor-fold defaultstate="collapsed" desc="llvm::PatternMatch::BinOp2_match">
@Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
 source = "${LLVM_SRC}/llvm/include/llvm/IR/PatternMatch.h", line = 635,
 FQN="llvm::PatternMatch::BinOp2_match", NM="_ZN4llvm12PatternMatch12BinOp2_matchE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/Transforms/Scalar/EarlyCSE.cpp -nm=_ZN4llvm12PatternMatch12BinOp2_matchE")
//</editor-fold>
public class/*struct*/ BinOp2_match</*typename*/ LHS_t extends match<LHS_t>, /*typename*/ RHS_t extends match<RHS_t>>  implements match<BinOp2_match> {
  /*template parameter*/ private final /*uint*/int Opc1;
  /*template parameter*/ private final /*uint*/int Opc2;

  public LHS_t L;
  public RHS_t R;
  
  //<editor-fold defaultstate="collapsed" desc="llvm::PatternMatch::BinOp2_match::BinOp2_match<LHS_t, RHS_t, Opc1, Opc2>">
  @Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/PatternMatch.h", line = 640,
   FQN="llvm::PatternMatch::BinOp2_match::BinOp2_match<LHS_t, RHS_t, Opc1, Opc2>", NM="_ZN4llvm12PatternMatch12BinOp2_matchC1ERKT_RKT0_",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/Transforms/Scalar/EarlyCSE.cpp -nm=_ZN4llvm12PatternMatch12BinOp2_matchC1ERKT_RKT0_")
  //</editor-fold>
  public BinOp2_match(/*uint*/int Opc1, /*uint*/int Opc2, final /*const*/ LHS_t /*&*/ LHS, final /*const*/ RHS_t /*&*/ RHS) {
    // : L(LHS), R(RHS) 
    //START JInit
    /*template parameter*/ this.Opc1 = Opc1;
    /*template parameter*/ this.Opc2 = Opc2;
    this.L = /*ParenListExpr*/$Clone(LHS);
    this.R = /*ParenListExpr*/$Clone(RHS);
    //END JInit
  }

  
  /*template <typename OpTy> TEMPLATE*/
  //<editor-fold defaultstate="collapsed" desc="llvm::PatternMatch::BinOp2_match::match">
  @Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/PatternMatch.h", line = 642,
   FQN="llvm::PatternMatch::BinOp2_match::match", NM="Tpl__ZN4llvm12PatternMatch12BinOp2_match5matchEPT_",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/Transforms/Scalar/EarlyCSE.cpp -nm=Tpl__ZN4llvm12PatternMatch12BinOp2_match5matchEPT_")
  //</editor-fold>
  public </*typename*/ OpTy extends Value> boolean match(OpTy /*P*/ V) {
    if (Native.$bool(Native.$eq(V.getValueID(), Value.ValueTy.InstructionVal.getValue() + Opc1))
       || Native.$bool(Native.$eq(V.getValueID(), Value.ValueTy.InstructionVal.getValue() + Opc2))) {
      BinaryOperator /*P*/ I = cast_BinaryOperator(V);
      return Native.$bool(L.match(I.getOperand(0))) && Native.$bool(R.match(I.getOperand(1)));
    }
    {
      ConstantExpr /*P*/ CE = dyn_cast_ConstantExpr(V);
      if (CE != null) {
        return Native.$bool(Native.$bool((Native.$bool(Native.$eq(CE.getOpcode(), Opc1)) || Native.$bool(Native.$eq(CE.getOpcode(), Opc2))))
           && Native.$bool(L.match(CE.getOperand(0)))) && Native.$bool(R.match(CE.getOperand(1)));
      }
    }
    return false;
  }

  //////////////////////////////////////////////////////////////
  // EXTRA MEMBERS: BEGIN

  public BinOp2_match(BinOp2_match<LHS_t, RHS_t> other) {
    /*template parameter*/ this.Opc1 = other.Opc1;
    /*template parameter*/ this.Opc2 = other.Opc2;
    this.L = /*ParenListExpr*/$Clone(other.L);
    this.R = /*ParenListExpr*/$Clone(other.R);
  }

  @Override
  public BinOp2_match clone() {
    return new BinOp2_match(this);
  }
  

  // EXTRA MEMBERS: END
  //////////////////////////////////////////////////////////////
  
  @Override public String toString() {
    return "" + "L=" + L // NOI18N
              + ", R=" + R; // NOI18N
  }
}
