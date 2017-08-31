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

package org.llvm.debuginfo.codeview;

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


// S_DEFRANGE_FRAMEPOINTER_REL_FULL_SCOPE
//<editor-fold defaultstate="collapsed" desc="llvm::codeview::DefRangeFramePointerRelFullScopeSym">
@Converted(kind = Converted.Kind.AUTO_NO_BODY,
 source = "${LLVM_SRC}/llvm/include/llvm/DebugInfo/CodeView/SymbolRecord.h", line = 842,
 FQN="llvm::codeview::DefRangeFramePointerRelFullScopeSym", NM="_ZN4llvm8codeview35DefRangeFramePointerRelFullScopeSymE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm/llvmToClangType ${LLVM_SRC}/llvm/lib/MC/MCCodeView.cpp -nm=_ZN4llvm8codeview35DefRangeFramePointerRelFullScopeSymE")
//</editor-fold>
public class DefRangeFramePointerRelFullScopeSym extends /*public*/ SymbolRecord {
/*public:*/
  //<editor-fold defaultstate="collapsed" desc="llvm::codeview::DefRangeFramePointerRelFullScopeSym::Hdr">
  @Converted(kind = Converted.Kind.AUTO_NO_BODY,
   source = "${LLVM_SRC}/llvm/include/llvm/DebugInfo/CodeView/SymbolRecord.h", line = 844,
   FQN="llvm::codeview::DefRangeFramePointerRelFullScopeSym::Hdr", NM="_ZN4llvm8codeview35DefRangeFramePointerRelFullScopeSym3HdrE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm/llvmToClangType ${LLVM_SRC}/llvm/lib/MC/MCCodeView.cpp -nm=_ZN4llvm8codeview35DefRangeFramePointerRelFullScopeSym3HdrE")
  //</editor-fold>
  public static class/*struct*/ Hdr {
    public llvm.support.unaligned_int32_t Offset; // Offset from the frame pointer register
    //<editor-fold defaultstate="collapsed" desc="llvm::codeview::DefRangeFramePointerRelFullScopeSym::Hdr::Hdr">
    @Converted(kind = Converted.Kind.AUTO_NO_BODY,
     source = "${LLVM_SRC}/llvm/include/llvm/DebugInfo/CodeView/SymbolRecord.h", line = 844,
     FQN="llvm::codeview::DefRangeFramePointerRelFullScopeSym::Hdr::Hdr", NM="_ZN4llvm8codeview35DefRangeFramePointerRelFullScopeSym3HdrC1ERKS2_",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm/llvmToClangType ${LLVM_SRC}/llvm/lib/MC/MCCodeView.cpp -nm=_ZN4llvm8codeview35DefRangeFramePointerRelFullScopeSym3HdrC1ERKS2_")
    //</editor-fold>
    public /*inline*/ Hdr(final /*const*/ Hdr /*&*/ $Prm0) {
      // : Offset(.Offset) 
      throw new UnsupportedOperationException("EmptyBody");
    }

    //<editor-fold defaultstate="collapsed" desc="llvm::codeview::DefRangeFramePointerRelFullScopeSym::Hdr::Hdr">
    @Converted(kind = Converted.Kind.AUTO_NO_BODY,
     source = "${LLVM_SRC}/llvm/include/llvm/DebugInfo/CodeView/SymbolRecord.h", line = 844,
     FQN="llvm::codeview::DefRangeFramePointerRelFullScopeSym::Hdr::Hdr", NM="_ZN4llvm8codeview35DefRangeFramePointerRelFullScopeSym3HdrC1EOS2_",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm/llvmToClangType ${LLVM_SRC}/llvm/lib/MC/MCCodeView.cpp -nm=_ZN4llvm8codeview35DefRangeFramePointerRelFullScopeSym3HdrC1EOS2_")
    //</editor-fold>
    public /*inline*/ Hdr(JD$Move _dparam, final Hdr /*&&*/$Prm0) {
      // : Offset(static_cast<Hdr &&>().Offset) 
      throw new UnsupportedOperationException("EmptyBody");
    }

    
    @Override public String toString() {
      return "" + "Offset=" + Offset; // NOI18N
    }
  };
  
  //<editor-fold defaultstate="collapsed" desc="llvm::codeview::DefRangeFramePointerRelFullScopeSym::DefRangeFramePointerRelFullScopeSym">
  @Converted(kind = Converted.Kind.AUTO_NO_BODY,
   source = "${LLVM_SRC}/llvm/include/llvm/DebugInfo/CodeView/SymbolRecord.h", line = 848,
   FQN="llvm::codeview::DefRangeFramePointerRelFullScopeSym::DefRangeFramePointerRelFullScopeSym", NM="_ZN4llvm8codeview35DefRangeFramePointerRelFullScopeSymC1EjPKNS1_3HdrE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm/llvmToClangType ${LLVM_SRC}/llvm/lib/MC/MCCodeView.cpp -nm=_ZN4llvm8codeview35DefRangeFramePointerRelFullScopeSymC1EjPKNS1_3HdrE")
  //</editor-fold>
  public DefRangeFramePointerRelFullScopeSym(/*uint32_t*/int RecordOffset, /*const*/ Hdr /*P*/ H) {
    // : SymbolRecord(SymbolRecordKind::DefRangeFramePointerRelFullScopeSym), RecordOffset(RecordOffset), Header(*H) 
    super(SymbolRecordKind.DefRangeFramePointerRelFullScopeSym);
    throw new UnsupportedOperationException("EmptyBody");
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::codeview::DefRangeFramePointerRelFullScopeSym::deserialize">
  @Converted(kind = Converted.Kind.AUTO_NO_BODY,
   source = "${LLVM_SRC}/llvm/include/llvm/DebugInfo/CodeView/SymbolRecord.h", line = 852,
   FQN="llvm::codeview::DefRangeFramePointerRelFullScopeSym::deserialize", NM="_ZN4llvm8codeview35DefRangeFramePointerRelFullScopeSym11deserializeENS0_16SymbolRecordKindEjRNS_8ArrayRefIhEE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm/llvmToClangType ${LLVM_SRC}/llvm/lib/MC/MCCodeView.cpp -nm=_ZN4llvm8codeview35DefRangeFramePointerRelFullScopeSym11deserializeENS0_16SymbolRecordKindEjRNS_8ArrayRefIhEE")
  //</editor-fold>
  public static ErrorOr<DefRangeFramePointerRelFullScopeSym> deserialize(/*SymbolRecordKind*//*uint16_t*/char Kind, /*uint32_t*/int RecordOffset, 
             final ArrayRefUChar/*&*/ Data) {
    throw new UnsupportedOperationException("EmptyBody");
  }

  
  public /*uint32_t*/int RecordOffset;
  public Hdr Header;
  //<editor-fold defaultstate="collapsed" desc="llvm::codeview::DefRangeFramePointerRelFullScopeSym::DefRangeFramePointerRelFullScopeSym">
  @Converted(kind = Converted.Kind.AUTO_NO_BODY,
   source = "${LLVM_SRC}/llvm/include/llvm/DebugInfo/CodeView/SymbolRecord.h", line = 842,
   FQN="llvm::codeview::DefRangeFramePointerRelFullScopeSym::DefRangeFramePointerRelFullScopeSym", NM="_ZN4llvm8codeview35DefRangeFramePointerRelFullScopeSymC1EOS1_",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm/llvmToClangType ${LLVM_SRC}/llvm/lib/MC/MCCodeView.cpp -nm=_ZN4llvm8codeview35DefRangeFramePointerRelFullScopeSymC1EOS1_")
  //</editor-fold>
  public /*inline*/ DefRangeFramePointerRelFullScopeSym(JD$Move _dparam, final DefRangeFramePointerRelFullScopeSym /*&&*/$Prm0) {
    // : SymbolRecord(static_cast<DefRangeFramePointerRelFullScopeSym &&>()), RecordOffset(static_cast<DefRangeFramePointerRelFullScopeSym &&>().RecordOffset), Header(static_cast<DefRangeFramePointerRelFullScopeSym &&>().Header) 
    super(JD$Move.INSTANCE, $Prm0);
    throw new UnsupportedOperationException("EmptyBody");
  }

  
  @Override public String toString() {
    return "" + "RecordOffset=" + RecordOffset // NOI18N
              + ", Header=" + Header // NOI18N
              + super.toString(); // NOI18N
  }
}