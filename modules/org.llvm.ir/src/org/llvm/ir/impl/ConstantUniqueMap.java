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

package org.llvm.ir.impl;

import org.clank.java.*;
import org.clank.support.*;
import org.clank.support.aliases.*;
import org.llvm.adt.aliases.*;
import org.llvm.ir.*;

/*template <class ConstantClass> TEMPLATE*/
//<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap">
@Converted(kind = Converted.Kind.DELETED,//Do not use this class, use explicit instantiations instead.
 source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 541,
 FQN="llvm::ConstantUniqueMap", NM="_ZN4llvm17ConstantUniqueMapE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMapE")
//</editor-fold>
public class ConstantUniqueMap</*class*/ ConstantClass>  implements Iterable<ConstantClass>, Destructors.ClassWithDestructor {

/*public:*/
  /*typedef typename ConstantInfo<ConstantClass>::ValType ValType*/
//  public final class ValType extends  ConstantInfo.ValType<ConstantClass>{ };
  /*typedef typename ConstantInfo<ConstantClass>::TypeClass TypeClass*/
//  public final class TypeClass extends  ConstantInfo.TypeClass<ConstantClass>{ };
  /*typedef std::pair<TypeClass *, ValType> LookupKey*/
//  public final class LookupKey extends std.pair< ConstantInfo.TypeClass<ConstantClass> /*P*/ ,  ConstantInfo.ValType<ConstantClass> >{ };
  
  /// Key and hash together, so that we compute the hash only once and reuse it.
  /*typedef std::pair<unsigned int, LookupKey> LookupKeyHashed*/
//  public final class LookupKeyHashed extends std.pair</*uint*/int, std.pair< ConstantInfo.TypeClass<ConstantClass> /*P*/ ,  ConstantInfo.ValType<ConstantClass> > >{ };
/*private:*/
  //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::MapInfo">
  @Converted(kind = Converted.Kind.AUTO_NO_BODY,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 551,
   FQN="llvm::ConstantUniqueMap::MapInfo", NM="_ZN4llvm17ConstantUniqueMap7MapInfoE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap7MapInfoE")
  //</editor-fold>
  private static class/*struct*/ MapInfo {
    /*typedef DenseMapInfo<ConstantClass *> ConstantClassInfo*/
//    public final class ConstantClassInfo extends DenseMapInfo<ConstantClass /*P*/ >{ };
    //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::MapInfo::getEmptyKey">
    @Converted(kind = Converted.Kind.AUTO_NO_BODY,
     source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 553,
     FQN="llvm::ConstantUniqueMap::MapInfo::getEmptyKey", NM="_ZN4llvm17ConstantUniqueMap7MapInfo11getEmptyKeyEv",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap7MapInfo11getEmptyKeyEv")
    //</editor-fold>
    public static /*inline*/ </*class*/ ConstantClass> ConstantClass /*P*/ getEmptyKey() {
      throw new UnsupportedOperationException("EmptyBody");
    }

    //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::MapInfo::getTombstoneKey">
    @Converted(kind = Converted.Kind.AUTO_NO_BODY,
     source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 556,
     FQN="llvm::ConstantUniqueMap::MapInfo::getTombstoneKey", NM="_ZN4llvm17ConstantUniqueMap7MapInfo15getTombstoneKeyEv",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap7MapInfo15getTombstoneKeyEv")
    //</editor-fold>
    public static /*inline*/ </*class*/ ConstantClass> ConstantClass /*P*/ getTombstoneKey() {
      throw new UnsupportedOperationException("EmptyBody");
    }

    //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::MapInfo::getHashValue">
    @Converted(kind = Converted.Kind.AUTO_NO_BODY,
     source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 559,
     FQN="llvm::ConstantUniqueMap::MapInfo::getHashValue", NM="_ZN4llvm17ConstantUniqueMap7MapInfo12getHashValueEPKT_",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap7MapInfo12getHashValueEPKT_")
    //</editor-fold>
    public static </*class*/ ConstantClass> /*uint*/int getHashValue(/*const*/ ConstantClass /*P*/ CP) {
      throw new UnsupportedOperationException("EmptyBody");
    }

    //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::MapInfo::isEqual">
    @Converted(kind = Converted.Kind.AUTO_NO_BODY,
     source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 563,
     FQN="llvm::ConstantUniqueMap::MapInfo::isEqual", NM="_ZN4llvm17ConstantUniqueMap7MapInfo7isEqualEPKT_S4_",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap7MapInfo7isEqualEPKT_S4_")
    //</editor-fold>
    public static </*class*/ ConstantClass> boolean isEqual(/*const*/ ConstantClass /*P*/ LHS, /*const*/ ConstantClass /*P*/ RHS) {
      throw new UnsupportedOperationException("EmptyBody");
    }

    //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::MapInfo::getHashValue">
    @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
     source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 566,
     FQN="llvm::ConstantUniqueMap::MapInfo::getHashValue", NM="_ZN4llvm17ConstantUniqueMap7MapInfo12getHashValueERKSt4pairIPNS_12ConstantInfoIT_E9TypeClassENS5_7ValTypeEE",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap7MapInfo12getHashValueERKSt4pairIPNS_12ConstantInfoIT_E9TypeClassENS5_7ValTypeEE")
    //</editor-fold>
    public static </*class*/ ConstantClass, ConstantInfoTypeClass, ConstantInfoValType> /*uint*/int getHashValue_pair$TypeClass$ValType$C$P(final /*const*/ std.pair< ConstantInfoTypeClass/*<ConstantClass>*/ /*P*/ ,  ConstantInfoValType/*<ConstantClass>*/ > /*&*/ Val) {
      throw new UnsupportedOperationException("EmptyBody");
    }

    //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::MapInfo::getHashValue">
    @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
     source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 569,
     FQN="llvm::ConstantUniqueMap::MapInfo::getHashValue", NM="_ZN4llvm17ConstantUniqueMap7MapInfo12getHashValueERKSt4pairIjS2_IPNS_12ConstantInfoIT_E9TypeClassENS5_7ValTypeEEE",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap7MapInfo12getHashValueERKSt4pairIjS2_IPNS_12ConstantInfoIT_E9TypeClassENS5_7ValTypeEEE")
    //</editor-fold>
    public static </*class*/ ConstantClass, ConstantInfoTypeClass, ConstantInfoValType> /*uint*/int getHashValue_pair$int$C$P(final /*const*/ std.pairUIntType<std.pair< ConstantInfoTypeClass/*<ConstantClass>*/ /*P*/ ,  ConstantInfoValType/*<ConstantClass>*/ > > /*&*/ Val) {
      throw new UnsupportedOperationException("EmptyBody");
    }

    //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::MapInfo::isEqual">
    @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
     source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 572,
     FQN="llvm::ConstantUniqueMap::MapInfo::isEqual", NM="_ZN4llvm17ConstantUniqueMap7MapInfo7isEqualERKSt4pairIPNS_12ConstantInfoIT_E9TypeClassENS5_7ValTypeEEPKS4_",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap7MapInfo7isEqualERKSt4pairIPNS_12ConstantInfoIT_E9TypeClassENS5_7ValTypeEEPKS4_")
    //</editor-fold>
    public static </*class*/ ConstantClass, ConstantInfoTypeClass, ConstantInfoValType> boolean isEqual_pair$TypeClass$ValType$C$P_T$C$P(final /*const*/ std.pair< ConstantInfoTypeClass/*<ConstantClass>*/ /*P*/ ,  ConstantInfoValType/*<ConstantClass>*/ > /*&*/ LHS, /*const*/ ConstantClass /*P*/ RHS) {
      throw new UnsupportedOperationException("EmptyBody");
    }

    //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::MapInfo::isEqual">
    @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
     source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 579,
     FQN="llvm::ConstantUniqueMap::MapInfo::isEqual", NM="_ZN4llvm17ConstantUniqueMap7MapInfo7isEqualERKSt4pairIjS2_IPNS_12ConstantInfoIT_E9TypeClassENS5_7ValTypeEEEPKS4_",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap7MapInfo7isEqualERKSt4pairIjS2_IPNS_12ConstantInfoIT_E9TypeClassENS5_7ValTypeEEEPKS4_")
    //</editor-fold>
    public static </*class*/ ConstantClass, ConstantInfoTypeClass, ConstantInfoValType> boolean isEqual_pair$int$C$P_T$C$P(final /*const*/ std.pairUIntType<std.pair< ConstantInfoTypeClass/*<ConstantClass>*/ /*P*/ ,  ConstantInfoValType/*<ConstantClass>*/ > > /*&*/ LHS, /*const*/ ConstantClass /*P*/ RHS) {
      throw new UnsupportedOperationException("EmptyBody");
    }

    
    @Override public String toString() {
      return ""; // NOI18N
    }
  };
/*public:*/
  /*typedef DenseSet<ConstantClass *, MapInfo> MapTy*/
//  public final class MapTy extends DenseSet<ConstantClass /*P*/ , MapInfo>{ };
/*private:*/
  private DenseSet<ConstantClass /*P*/> Map;
/*public:*/
  //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::begin">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 591,
   FQN="llvm::ConstantUniqueMap::begin", NM="_ZN4llvm17ConstantUniqueMap5beginEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap5beginEv")
  //</editor-fold>
  public  DenseSet.iterator<ConstantClass /*P*/> begin() {
    throw new UnsupportedOperationException("EmptyBody");
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::end">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 592,
   FQN="llvm::ConstantUniqueMap::end", NM="_ZN4llvm17ConstantUniqueMap3endEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap3endEv")
  //</editor-fold>
  public  DenseSet.iterator<ConstantClass /*P*/> end() {
    throw new UnsupportedOperationException("EmptyBody");
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::freeConstants">
  @Converted(kind = Converted.Kind.AUTO_NO_BODY,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 594,
   FQN="llvm::ConstantUniqueMap::freeConstants", NM="_ZN4llvm17ConstantUniqueMap13freeConstantsEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap13freeConstantsEv")
  //</editor-fold>
  public void freeConstants() {
    throw new UnsupportedOperationException("EmptyBody");
  }

/*private:*/
  //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::create">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 599,
   FQN="llvm::ConstantUniqueMap::create", NM="_ZN4llvm17ConstantUniqueMap6createEPNS_12ConstantInfoIT_E9TypeClassENS3_7ValTypeERSt4pairIjS7_IS5_S6_EE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap6createEPNS_12ConstantInfoIT_E9TypeClassENS3_7ValTypeERSt4pairIjS7_IS5_S6_EE")
  //</editor-fold>
  private <ConstantInfoTypeClass, ConstantInfoValType> ConstantClass /*P*/ create( ConstantInfoTypeClass/*<ConstantClass>*/ /*P*/ Ty,  ConstantInfoValType/*<ConstantClass>*/ V, final std.pairUIntType<std.pair< ConstantInfoTypeClass/*<ConstantClass>*/ /*P*/ ,  ConstantInfoValType/*<ConstantClass>*/ > > /*&*/ HashKey) {
    throw new UnsupportedOperationException("EmptyBody");
  }

/*public:*/
  /// Return the specified constant from the map, creating it if necessary.
  //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::getOrCreate">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 610,
   FQN="llvm::ConstantUniqueMap::getOrCreate", NM="_ZN4llvm17ConstantUniqueMap11getOrCreateEPNS_12ConstantInfoIT_E9TypeClassENS3_7ValTypeE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap11getOrCreateEPNS_12ConstantInfoIT_E9TypeClassENS3_7ValTypeE")
  //</editor-fold>
  public <ConstantInfoTypeClass, ConstantInfoValType> ConstantClass /*P*/ getOrCreate( ConstantInfoTypeClass/*<ConstantClass>*/ /*P*/ Ty,  ConstantInfoValType/*<ConstantClass>*/ V) {
    throw new UnsupportedOperationException("EmptyBody");
  }

  
  /// Remove this constant from the map
  //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::remove">
  @Converted(kind = Converted.Kind.AUTO_NO_BODY,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 628,
   FQN="llvm::ConstantUniqueMap::remove", NM="_ZN4llvm17ConstantUniqueMap6removeEPT_",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap6removeEPT_")
  //</editor-fold>
  public void remove(ConstantClass /*P*/ CP) {
    throw new UnsupportedOperationException("EmptyBody");
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::replaceOperandsInPlace">
  @Converted(kind = Converted.Kind.AUTO_NO_BODY,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 635,
   FQN="llvm::ConstantUniqueMap::replaceOperandsInPlace", NM="_ZN4llvm17ConstantUniqueMap22replaceOperandsInPlaceENS_8ArrayRefIPNS_8ConstantEEEPT_PNS_5ValueES3_jj",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZN4llvm17ConstantUniqueMap22replaceOperandsInPlaceENS_8ArrayRefIPNS_8ConstantEEEPT_PNS_5ValueES3_jj")
  //</editor-fold>
  public ConstantClass /*P*/ replaceOperandsInPlace(ArrayRef<Constant /*P*/ > Operands, 
                        ConstantClass /*P*/ CP, Value /*P*/ From, 
                        Constant /*P*/ To) {
    return replaceOperandsInPlace(Operands, 
                        CP, From, 
                        To, 0, 
                        ~0/*U*/);
  }
  public ConstantClass /*P*/ replaceOperandsInPlace(ArrayRef<Constant /*P*/ > Operands, 
                        ConstantClass /*P*/ CP, Value /*P*/ From, 
                        Constant /*P*/ To, /*uint*/int NumUpdated/*= 0*/) {
    return replaceOperandsInPlace(Operands, 
                        CP, From, 
                        To, NumUpdated, 
                        ~0/*U*/);
  }
  public ConstantClass /*P*/ replaceOperandsInPlace(ArrayRef<Constant /*P*/ > Operands, 
                        ConstantClass /*P*/ CP, Value /*P*/ From, 
                        Constant /*P*/ To, /*uint*/int NumUpdated/*= 0*/, 
                        /*uint*/int OperandNo/*= ~0uU*/) {
    throw new UnsupportedOperationException("EmptyBody");
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ConstantUniqueMap::dump">
  @Converted(kind = Converted.Kind.AUTO_NO_BODY,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 663,
   FQN="llvm::ConstantUniqueMap::dump", NM="_ZNK4llvm17ConstantUniqueMap4dumpEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/Constants.cpp -nm=_ZNK4llvm17ConstantUniqueMap4dumpEv")
  //</editor-fold>
  public void dump() /*const*/ {
    throw new UnsupportedOperationException("EmptyBody");
  }

  //////////////////////////////////////////////////////////////
  // EXTRA MEMBERS: BEGIN

  @Override public java.util.Iterator<ConstantClass> iterator() { return new JavaIterator<ConstantClass>(begin(), end()); }
  
  @Override public void $destroy() { }


  // EXTRA MEMBERS: END
  //////////////////////////////////////////////////////////////
  
  @Override public String toString() {
    return "" + "Map=" + Map; // NOI18N
  }
}
