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

package org.llvm.ir;

import org.clank.java.*;
import org.clank.support.*;
import org.clank.support.aliases.*;
import org.clank.support.JavaDifferentiators.*;
import static org.clank.java.built_in.*;
import static org.clank.support.Casts.*;
import static org.clank.java.io.*;
import static org.clank.java.std.*;
import static org.clank.java.std_pair.*;
import static org.clank.support.NativePointer.*;
import static org.clank.support.NativeType.*;
import static org.clank.support.Native.*;
import static org.clank.support.Unsigned.*;
import static org.clank.support.JavaCleaner.JC$Push;
import static org.clank.support.JavaCleaner.JC$Pop;
import static org.clank.support.JavaCleaner.JC$Top;
import org.clank.support.NativeCallback.*;
import static org.llvm.adt.ADTAliases.*;
import static org.llvm.adt.ADTFunctionPointers.*;
import org.llvm.llvmc.*;
import static org.llvm.support.llvm.*;
import org.llvm.support.*;
import org.llvm.adt.*;
import org.llvm.adt.aliases.*;
import org.llvm.ir.*;
import org.llvm.ir.impl.*;
import org.llvm.ir.Metadata.*;
import org.llvm.ir.intrinsic.*;
import static org.llvm.ir.java.IRFunctionPointers.*;
import static org.llvm.ir.java.IrRTTI.*;
import static org.llvm.ir.java.IRJavaDifferentiators.*;
import org.llvm.cl.*;
import org.llvm.ir.java.IRJavaDifferentiators.*;
import org.llvm.ir.java.IRMemberPointers.*;
import org.llvm.ir.java.*;
import org.llvm.pass.*;
import org.llvm.support.dwarf.Tag;
import org.llvm.support.sys.SmartRWMutex;
import org.llvm.ir.java.cst_pred_ty_Predicate;
import org.llvm.ir.legacy.PassManagerBase;
import org.llvm.ir.PassManagerGlobals.*;
import org.llvm.ir.java.MDNodeKeyImpl;
import static org.llvm.adt.HashingGlobals.*;


//===----------------------------------------------------------------------===//
//                                 PtrToIntInst Class
//===----------------------------------------------------------------------===//

/// \brief This class represents a cast from a pointer to an integer
//<editor-fold defaultstate="collapsed" desc="llvm::PtrToIntInst">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/include/llvm/IR/Instructions.h", line = 4799,
 FQN="llvm::PtrToIntInst", NM="_ZN4llvm12PtrToIntInstE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Instructions.cpp -nm=_ZN4llvm12PtrToIntInstE")
//</editor-fold>
public class PtrToIntInst extends /*public*/ CastInst implements Destructors.ClassWithDestructor {
/*protected:*/
  // Note: Instruction needs to be a friend here to call cloneImpl.
  /*friend  class Instruction*/
  /// \brief Clone an identical PtrToIntInst
  //<editor-fold defaultstate="collapsed" desc="llvm::PtrToIntInst::cloneImpl">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/lib/IR/Instructions.cpp", line = 3991,
   FQN="llvm::PtrToIntInst::cloneImpl", NM="_ZNK4llvm12PtrToIntInst9cloneImplEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Instructions.cpp -nm=_ZNK4llvm12PtrToIntInst9cloneImplEv")
  //</editor-fold>
  protected PtrToIntInst /*P*/ cloneImpl() /*const*/ {
    return /*NEW_EXPR [UnaryInstruction::new]*/UnaryInstruction.$new_UnaryInstruction((type$ptr<?> New$Mem)->{
        return new PtrToIntInst(getOperand(0), getType());
     });
  }

/*public:*/
  /// \brief Constructor with insert-before-instruction semantics
  //<editor-fold defaultstate="collapsed" desc="llvm::PtrToIntInst::PtrToIntInst">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/lib/IR/Instructions.cpp", line = 3306,
   FQN="llvm::PtrToIntInst::PtrToIntInst", NM="_ZN4llvm12PtrToIntInstC1EPNS_5ValueEPNS_4TypeERKNS_5TwineEPNS_11InstructionE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Instructions.cpp -nm=_ZN4llvm12PtrToIntInstC1EPNS_5ValueEPNS_4TypeERKNS_5TwineEPNS_11InstructionE")
  //</editor-fold>
  public PtrToIntInst(Value /*P*/ S, Type /*P*/ Ty) {
    this(S, Ty, new Twine(///< The type to convert to
      /*KEEP_STR*/$EMPTY), (Instruction /*P*/ )null);
  }
  public PtrToIntInst(Value /*P*/ S, Type /*P*/ Ty, final /*const*/ Twine /*&*/ Name/*= ""*/) {
    this(S, Ty, Name, (Instruction /*P*/ )null);
  }
  public PtrToIntInst(Value /*P*/ S, Type /*P*/ Ty, final /*const*/ Twine /*&*/ Name/*= ""*/, Instruction /*P*/ InsertBefore/*= null*/) {
    // : CastInst(Ty, PtrToInt, S, Name, InsertBefore) 
    //START JInit
    super(Ty, CastOps.PtrToInt, S, Name, InsertBefore);
    //END JInit
    assert (castIsValid(getOpcode(), S, Ty)) : "Illegal PtrToInt";
  }

  
  /// \brief Constructor with insert-at-end-of-block semantics
  //<editor-fold defaultstate="collapsed" desc="llvm::PtrToIntInst::PtrToIntInst">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/lib/IR/Instructions.cpp", line = 3312,
   FQN="llvm::PtrToIntInst::PtrToIntInst", NM="_ZN4llvm12PtrToIntInstC1EPNS_5ValueEPNS_4TypeERKNS_5TwineEPNS_10BasicBlockE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Instructions.cpp -nm=_ZN4llvm12PtrToIntInstC1EPNS_5ValueEPNS_4TypeERKNS_5TwineEPNS_10BasicBlockE")
  //</editor-fold>
  public PtrToIntInst(Value /*P*/ S, Type /*P*/ Ty, final /*const*/ Twine /*&*/ Name, BasicBlock /*P*/ InsertAtEnd) {
    // : CastInst(Ty, PtrToInt, S, Name, InsertAtEnd) 
    //START JInit
    super(Ty, CastOps.PtrToInt, S, Name, InsertAtEnd);
    //END JInit
    assert (castIsValid(getOpcode(), S, Ty)) : "Illegal PtrToInt";
  }

  
  /// \brief Gets the pointer operand.
  //<editor-fold defaultstate="collapsed" desc="llvm::PtrToIntInst::getPointerOperand">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/Instructions.h", line = 4824,
   FQN="llvm::PtrToIntInst::getPointerOperand", NM="_ZN4llvm12PtrToIntInst17getPointerOperandEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Instructions.cpp -nm=_ZN4llvm12PtrToIntInst17getPointerOperandEv")
  //</editor-fold>
  public Value /*P*/ getPointerOperand() {
    return getOperand(0);
  }

  /// \brief Gets the pointer operand.
  //<editor-fold defaultstate="collapsed" desc="llvm::PtrToIntInst::getPointerOperand">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/Instructions.h", line = 4826,
   FQN="llvm::PtrToIntInst::getPointerOperand", NM="_ZNK4llvm12PtrToIntInst17getPointerOperandEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Instructions.cpp -nm=_ZNK4llvm12PtrToIntInst17getPointerOperandEv")
  //</editor-fold>
  public /*const*/ Value /*P*/ getPointerOperand$Const() /*const*/ {
    return getOperand(0);
  }

  /// \brief Gets the operand index of the pointer operand.
  //<editor-fold defaultstate="collapsed" desc="llvm::PtrToIntInst::getPointerOperandIndex">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/Instructions.h", line = 4828,
   FQN="llvm::PtrToIntInst::getPointerOperandIndex", NM="_ZN4llvm12PtrToIntInst22getPointerOperandIndexEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Instructions.cpp -nm=_ZN4llvm12PtrToIntInst22getPointerOperandIndexEv")
  //</editor-fold>
  public static /*uint*/int getPointerOperandIndex() {
    return 0/*U*/;
  }

  
  /// \brief Returns the address space of the pointer operand.
  //<editor-fold defaultstate="collapsed" desc="llvm::PtrToIntInst::getPointerAddressSpace">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/Instructions.h", line = 4831,
   FQN="llvm::PtrToIntInst::getPointerAddressSpace", NM="_ZNK4llvm12PtrToIntInst22getPointerAddressSpaceEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Instructions.cpp -nm=_ZNK4llvm12PtrToIntInst22getPointerAddressSpaceEv")
  //</editor-fold>
  public /*uint*/int getPointerAddressSpace() /*const*/ {
    return getPointerOperand$Const().getType().getPointerAddressSpace();
  }

  
  // Methods for support type inquiry through isa, cast, and dyn_cast:
  //<editor-fold defaultstate="collapsed" desc="llvm::PtrToIntInst::classof">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/Instructions.h", line = 4836,
   FQN="llvm::PtrToIntInst::classof", NM="_ZN4llvm12PtrToIntInst7classofEPKNS_11InstructionE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Instructions.cpp -nm=_ZN4llvm12PtrToIntInst7classofEPKNS_11InstructionE")
  //</editor-fold>
  public static /*inline*/ boolean classof(/*const*/ Instruction /*P*/ I) {
    return I.getOpcode() == CastOps.PtrToInt;
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::PtrToIntInst::classof">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/Instructions.h", line = 4839,
   FQN="llvm::PtrToIntInst::classof", NM="_ZN4llvm12PtrToIntInst7classofEPKNS_5ValueE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Instructions.cpp -nm=_ZN4llvm12PtrToIntInst7classofEPKNS_5ValueE")
  //</editor-fold>
  public static /*inline*/ boolean classof(/*const*/ Value /*P*/ V) {
    return isa_Instruction(V) && PtrToIntInst.classof(cast_Instruction(V));
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::PtrToIntInst::~PtrToIntInst">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/Instructions.h", line = 4799,
   FQN="llvm::PtrToIntInst::~PtrToIntInst", NM="_ZN4llvm12PtrToIntInstD0Ev",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Instructions.cpp -nm=_ZN4llvm12PtrToIntInstD0Ev")
  //</editor-fold>
  @Override public /*inline*/ void $destroy() {
    super.$destroy();
  }

  
  @Override public String toString() {
    return "" + super.toString(); // NOI18N
  }
}
