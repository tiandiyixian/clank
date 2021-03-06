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

package org.llvm.llvm_c;

import org.clank.java.*;
import org.clank.support.*;
import org.clank.support.aliases.*;
import org.clank.support.JavaDifferentiators.*;
import static org.clank.java.built_in.*;
import static org.clank.support.Casts.*;
import static org.clank.java.io.*;
import static org.clank.java.std.*;
import static org.clank.java.std_pair.*;
import static org.llvm.adt.ADTAliases.*;
import static org.llvm.support.llvm.*;
import static org.clank.support.NativePointer.*;
import static org.clank.support.NativeType.*;
import static org.clank.support.Native.*;
import static org.clank.support.Unsigned.*;
import org.clank.support.NativeCallback.*;
import org.llvm.support.*;
import org.llvm.adt.*;
import org.llvm.adt.aliases.*;


/**
* The initial support in LLVM MC for the most general form of a relocatable
* expression is "AddSymbol - SubtractSymbol + Offset".  For some Darwin targets
* this full form is encoded in the relocation information so that AddSymbol and
* SubtractSymbol can be link edited independent of each other.  Many other
* platforms only allow a relocatable expression of the form AddSymbol + Offset
* to be encoded.
*
* The LLVMOpInfoCallback() for the TagType value of 1 uses the struct
* LLVMOpInfo1.  The value of the relocatable expression for the operand,
* including any PC adjustment, is passed in to the call back in the Value
* field.  The symbolic information about the operand is returned using all
* the fields of the structure with the Offset of the relocatable expression
* returned in the Value field.  It is possible that some symbols in the
* relocatable expression were assembly temporary symbols, for example
* "Ldata - LpicBase + constant", and only the Values of the symbols without
* symbol names are present in the relocation information.  The VariantKind
* type is one of the Target specific #defines below and is used to print
* operands like "_foo@GOT", ":lower16:_foo", etc.
*/
//<editor-fold defaultstate="collapsed" desc="LLVMOpInfoSymbol1">
@Converted(kind = Converted.Kind.AUTO_NO_BODY,
 source = "${LLVM_SRC}/llvm/include/llvm-c/Disassembler.h", line = 78,
 FQN="LLVMOpInfoSymbol1", NM="_Z17LLVMOpInfoSymbol1",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm/llvmToClangType ${LLVM_SRC}/llvm/lib/MC/MCDisassembler/MCExternalSymbolizer.cpp -nm=_Z17LLVMOpInfoSymbol1")
//</editor-fold>
public class/*struct*/ LLVMOpInfoSymbol1 {
  public long/*uint64_t*/ Present; /* 1 if this symbol is present */
  public /*const*/char$ptr/*char P*/ Name; /* symbol name if not NULL */
  public long/*uint64_t*/ Value; /* symbol value if name is NULL */
  //<editor-fold defaultstate="collapsed" desc="LLVMOpInfoSymbol1::LLVMOpInfoSymbol1">
  @Converted(kind = Converted.Kind.AUTO_NO_BODY,
   source = "${LLVM_SRC}/llvm/include/llvm-c/Disassembler.h", line = 78,
   FQN="LLVMOpInfoSymbol1::LLVMOpInfoSymbol1", NM="_ZN17LLVMOpInfoSymbol1C1Ev",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm/llvmToClangType ${LLVM_SRC}/llvm/lib/MC/MCDisassembler/MCExternalSymbolizer.cpp -nm=_ZN17LLVMOpInfoSymbol1C1Ev")
  //</editor-fold>
  public /*inline*/ LLVMOpInfoSymbol1() {
    throw new UnsupportedOperationException("EmptyBody");
  }

  
  @Override public String toString() {
    return "" + "Present=" + Present // NOI18N
              + ", Name=" + Name // NOI18N
              + ", Value=" + Value; // NOI18N
  }
}
