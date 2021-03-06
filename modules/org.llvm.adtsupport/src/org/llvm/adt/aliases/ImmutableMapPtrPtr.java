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

package org.llvm.adt.aliases;

import java.util.Iterator;
import org.clank.java.*;
import org.clank.support.*;
import org.clank.support.aliases.*;
import org.clank.support.NativeCallback.*;
import org.llvm.support.*;
import org.llvm.adt.*;

//template <typename KeyT, typename ValT, typename ValInfo = ImutKeyValueInfo<KeyT, DataT>> TEMPLATE
//<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 58,
 FQN="llvm::ImmutableMap", NM="_ZN4llvm12ImmutableMapE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMapE")
//</editor-fold>
public class ImmutableMapPtrPtr<KeyT, DataT> extends NativeTrace.CreateDestroy$Tracker
    implements Destructors.ClassWithDestructor, Native.NativeComparable<ImmutableMapPtrPtr<KeyT, DataT>>, 
      Native.NativeIterable<ImmutableMapPtrPtr.iterator<KeyT, DataT>>, Iterable<std.pairPtrPtr<KeyT, DataT>>, FoldingSetTrait.Profilable, NativeCloneable<ImmutableMapPtrPtr<KeyT, DataT>> {
/*public:*/
  /*typedef typename ValInfo::value_type value_type*/
//  public final class value_type extends  ValInfo.value_type{ };
  /*typedef typename ValInfo::value_type_ref value_type_ref*/
//  public final class value_type_ref extends  ValInfo.value_type_ref{ };
  /*typedef typename ValInfo::key_type key_type*/
//  public final class key_type extends  KeyT{ };
  /*typedef typename ValInfo::key_type_ref key_type_ref*/
//  public final class key_type_ref extends  KeyT{ };
  /*typedef typename ValInfo::data_type data_type*/
//  public final class data_type extends  ValT{ };
  /*typedef typename ValInfo::data_type_ref data_type_ref*/
//  public final class data_type_ref extends  ValInfo.data_type_ref{ };
//  /*typedef ImutAVLTree<KeyT, ValT> TreeTy*/
//  public final class TreeTy extends ImutAVLTree<KeyT, ValT>{ };
/*protected:*/
  protected ImutAVLTreePtrPtrType<KeyT, DataT, std.pairPtrPtr<KeyT, DataT>> /*P*/ Root;
/*public:*/
  /// Constructs a map from a pointer to a tree root.  In general one
  /// should use a Factory object to create maps instead of directly
  /// invoking the constructor, but there are cases where make this
  /// constructor public is useful.
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::ImmutableMapPtrPtr<KeyT, DataT>">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 78,
   FQN="llvm::ImmutableMap::ImmutableMapPtrPtr<KeyT, DataT>", NM="_ZN4llvm12ImmutableMapC1EPKNS_11ImutAVLTreeIT1_EE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMapC1EPKNS_11ImutAVLTreeIT1_EE")
  //</editor-fold>
  public /*explicit*/ ImmutableMapPtrPtr(/*const*/ ImutAVLTreePtrPtrType<KeyT, DataT, std.pairPtrPtr<KeyT, DataT>> /*P*/ R) {
    // : Root(const_cast<TreeTy * >(R)) 
    //START JInit
    this.Root = /*ParenListExpr*/((/*const_cast*/ImutAVLTreePtrPtrType<KeyT, DataT, std.pairPtrPtr<KeyT, DataT>> /*P*/ )(R));
    //END JInit
    if (Root != null) {
      Root.retain();
    }
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::ImmutableMapPtrPtr<KeyT, DataT>">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 82,
   FQN="llvm::ImmutableMap::ImmutableMapPtrPtr<KeyT, DataT>", NM="_ZN4llvm12ImmutableMapC1ERKNS_12ImmutableMapIT_T0_T1_EE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMapC1ERKNS_12ImmutableMapIT_T0_T1_EE")
  //</editor-fold>
  public ImmutableMapPtrPtr(final /*const*/ ImmutableMapPtrPtr<KeyT, DataT> /*&*/ X) {
    // : Root(X.Root) 
    assert X.checkAlive();
    //START JInit
    this.Root = /*ParenListExpr*/X.Root;
    //END JInit
    if (Root != null) {
      Root.retain();
    }
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::operator=">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 86,
   FQN="llvm::ImmutableMap::operator=", NM="_ZN4llvm12ImmutableMapaSERKNS_12ImmutableMapIT_T0_T1_EE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMapaSERKNS_12ImmutableMapIT_T0_T1_EE")
  //</editor-fold>
  public ImmutableMapPtrPtr<KeyT, DataT> /*&*/ $assign(final /*const*/ ImmutableMapPtrPtr<KeyT, DataT> /*&*/ X) {
    assert X.checkAlive();
    assert checkAlive();
    if (Root != X.Root) {
      if (X.Root != null) {
        X.Root.retain();
      }
      if (Root != null) {
        Root.release();
      }
      Root = X.Root;
    }
    return this;
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::~ImmutableMapPtrPtr<KeyT, DataT>">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 95,
   FQN="llvm::ImmutableMap::~ImmutableMapPtrPtr<KeyT, DataT>", NM="_ZN4llvm12ImmutableMapD0Ev",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMapD0Ev")
  //</editor-fold>
  public void $destroy() {
    assert checkAlive();
    if (Root != null) {
      Root.release();
    }
    super.set$destroyed();
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::Factory">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 99,
   FQN="llvm::ImmutableMap::Factory", NM="_ZN4llvm12ImmutableMap7FactoryE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap7FactoryE")
  //</editor-fold>
  public static class Factory<KeyT, DataT> implements Destructors.ClassWithDestructor {
    private  ImutAVLFactoryPtrPtrType<KeyT, DataT, std.pairPtrPtr<KeyT, DataT>> F;
    private /*const*/boolean Canonicalize;
  /*public:*/
    //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::Factory::Factory">
    @Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
     source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 104,
     FQN="llvm::ImmutableMap::Factory::Factory", NM="_ZN4llvm12ImmutableMap7FactoryC1Eb",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap7FactoryC1Eb")
    //</editor-fold>
    public Factory(ImutKeyValueInfo$TP$SP<KeyT, DataT> ImutInfo) {
      this(ImutInfo, true);
    }
    public Factory(ImutKeyValueInfo$TP$SP<KeyT, DataT> ImutInfo, boolean canonicalize/*= true*/) {
      // : Canonicalize(canonicalize) 
      assert ImutInfo != null;
      //START JInit
      this.F = new ImutAVLFactoryPtrPtrType<KeyT, DataT, std.pairPtrPtr<KeyT, DataT>>(ImutInfo);
      this.Canonicalize = canonicalize;
      //END JInit
    }

    
    //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::Factory::Factory">
    @Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
     source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 106,
     FQN="llvm::ImmutableMap::Factory::Factory", NM="_ZN4llvm12ImmutableMap7FactoryC1ERNS_20BumpPtrAllocatorImplINS_15MallocAllocatorELj4096ELj4096EEEb",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap7FactoryC1ERNS_20BumpPtrAllocatorImplINS_15MallocAllocatorELj4096ELj4096EEEb")
    //</editor-fold>
    public Factory(ImutKeyValueInfo$TP$SP<KeyT, DataT> ImutInfo, final BumpPtrAllocatorImpl /*&*/ Alloc) {
      this(ImutInfo, Alloc, true);
    }
    public Factory(ImutKeyValueInfo$TP$SP<KeyT, DataT> ImutInfo, final BumpPtrAllocatorImpl /*&*/ Alloc, boolean canonicalize/*= true*/) {
      // : F(Alloc), Canonicalize(canonicalize) 
      assert ImutInfo != null;
      //START JInit
      this.F = /*ParenListExpr*/new  ImutAVLFactoryPtrPtrType<KeyT, DataT, std.pairPtrPtr<KeyT, DataT>>(ImutInfo, Alloc);
      this.Canonicalize = canonicalize;
      //END JInit
    }
    
    //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::Factory::getEmptyMap">
    @Converted(kind = Converted.Kind.AUTO,
     source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 109,
     FQN="llvm::ImmutableMap::Factory::getEmptyMap", NM="_ZN4llvm12ImmutableMap7Factory11getEmptyMapEv",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap7Factory11getEmptyMapEv")
    //</editor-fold>
    public ImmutableMapPtrPtr<KeyT, DataT> getEmptyMap() {
      return new ImmutableMapPtrPtr<KeyT, DataT>(F.getEmptyTree());
    }

    
    //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::Factory::add">
    @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
     source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 111,
     FQN="llvm::ImmutableMap::Factory::add", NM="_ZN4llvm12ImmutableMap7Factory3addENS_12ImmutableMapIT_T0_T1_EENS5_12key_type_refENS5_13data_type_refE",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap7Factory3addENS_12ImmutableMapIT_T0_T1_EENS5_12key_type_refENS5_13data_type_refE")
    //</editor-fold>
    public ImmutableMapPtrPtr<KeyT, DataT> add(ImmutableMapPtrPtr<KeyT, DataT> Old,  KeyT K,  DataT D) {
      ImutAVLTreePtrPtrType<KeyT, DataT, std.pairPtrPtr<KeyT, DataT>> /*P*/ T = F.add(Old.Root, new std.pairPtrPtr<KeyT, DataT>(K, D));
      return new ImmutableMapPtrPtr<KeyT, DataT>(Canonicalize ? F.getCanonicalTree(T) : T);
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::Factory::remove">
    @Converted(kind = Converted.Kind.AUTO,
     source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 116,
     FQN="llvm::ImmutableMap::Factory::remove", NM="_ZN4llvm12ImmutableMap7Factory6removeENS_12ImmutableMapIT_T0_T1_EENS5_12key_type_refE",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap7Factory6removeENS_12ImmutableMapIT_T0_T1_EENS5_12key_type_refE")
    //</editor-fold>
    public ImmutableMapPtrPtr<KeyT, DataT> remove(ImmutableMapPtrPtr<KeyT, DataT> Old,  KeyT K) {
      ImutAVLTreePtrPtrType<KeyT, DataT, std.pairPtrPtr<KeyT, DataT>> /*P*/ T = F.remove(Old.Root, K);
      return new ImmutableMapPtrPtr<KeyT, DataT>(Canonicalize ? F.getCanonicalTree(T) : T);
    }

    
    //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::Factory::getTreeFactory">
    @Converted(kind = Converted.Kind.AUTO,
     source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 121,
     FQN="llvm::ImmutableMap::Factory::getTreeFactory", NM="_ZNK4llvm12ImmutableMap7Factory14getTreeFactoryEv",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMap7Factory14getTreeFactoryEv")
    //</editor-fold>
    public  ImutAVLFactoryPtrPtrType<KeyT, DataT, std.pairPtrPtr<KeyT, DataT>> /*P*/ getTreeFactory() /*const*/ {
      return ((/*const_cast*/ ImutAVLFactoryPtrPtrType<KeyT, DataT, std.pairPtrPtr<KeyT, DataT>> /*P*/ )(/*AddrOf*/F));
    }

    @Override
    public void $destroy() {
      this.F.$destroy();
    }

  /*private:*/
    //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::Factory::Factory">
    @Converted(kind = Converted.Kind.AUTO,
     source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 126,
     FQN="llvm::ImmutableMap::Factory::Factory", NM="_ZN4llvm12ImmutableMap7FactoryC1ERKS1_",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap7FactoryC1ERKS1_")
    //</editor-fold>
    private Factory(final /*const*/ Factory /*&*/ RHS) { throw new UnsupportedOperationException("Deleted");}

    //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::Factory::operator=">
    @Converted(kind = Converted.Kind.AUTO,
     source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 127,
     FQN="llvm::ImmutableMap::Factory::operator=", NM="_ZN4llvm12ImmutableMap7FactoryaSERKS1_",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap7FactoryaSERKS1_")
    //</editor-fold>
    private void $assign(final /*const*/ Factory /*&*/ RHS) { throw new UnsupportedOperationException("Deleted");}

    
    @Override public String toString() {
      return "" + "F=" + F // NOI18N
                + ", Canonicalize=" + Canonicalize; // NOI18N
    }
  };
  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::contains">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 130,
   FQN="llvm::ImmutableMap::contains", NM="_ZNK4llvm12ImmutableMap8containsENT1_12key_type_refE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMap8containsENT1_12key_type_refE")
  //</editor-fold>
  public boolean contains( KeyT K) /*const*/ {
    assert checkAlive();
    return Root != null ? Root.contains(K) : false;
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::operator==">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 134,
   FQN="llvm::ImmutableMap::operator==", NM="_ZNK4llvm12ImmutableMapeqERKNS_12ImmutableMapIT_T0_T1_EE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMapeqERKNS_12ImmutableMapIT_T0_T1_EE")
  //</editor-fold>
  @Override public boolean $eq(final /*const*/ ImmutableMapPtrPtr<KeyT, DataT> /*&*/ RHS) /*const*/ {
    assert checkAlive();
    return Root != null && RHS.Root != null ? Root.isEqual(RHS.Root) : Root == RHS.Root;
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::operator!=">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 138,
   FQN="llvm::ImmutableMap::operator!=", NM="_ZNK4llvm12ImmutableMapneERKNS_12ImmutableMapIT_T0_T1_EE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMapneERKNS_12ImmutableMapIT_T0_T1_EE")
  //</editor-fold>
  @Override public boolean $noteq(final /*const*/ ImmutableMapPtrPtr<KeyT, DataT> /*&*/ RHS) /*const*/ {
    assert checkAlive();
    return Root != null && RHS.Root != null ? Root.isNotEqual(RHS.Root) : Root != RHS.Root;
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::getRoot">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 142,
   FQN="llvm::ImmutableMap::getRoot", NM="_ZNK4llvm12ImmutableMap7getRootEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMap7getRootEv")
  //</editor-fold>
  public ImutAVLTreePtrPtrType<KeyT, DataT, std.pairPtrPtr<KeyT, DataT>> /*P*/ getRoot() /*const*/ {
    assert checkAlive();
    if (Root != null) {
      Root.retain();
    }
    return Root;
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::getRootWithoutRetain">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 147,
   FQN="llvm::ImmutableMap::getRootWithoutRetain", NM="_ZNK4llvm12ImmutableMap20getRootWithoutRetainEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMap20getRootWithoutRetainEv")
  //</editor-fold>
  public ImutAVLTreePtrPtrType<KeyT, DataT, std.pairPtrPtr<KeyT, DataT>> /*P*/ getRootWithoutRetain() /*const*/ {
    assert checkAlive();
    return Root;
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::manualRetain">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 149,
   FQN="llvm::ImmutableMap::manualRetain", NM="_ZN4llvm12ImmutableMap12manualRetainEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap12manualRetainEv")
  //</editor-fold>
  public void manualRetain() {
    assert checkAlive();
    if (Root != null) {
      Root.retain();
    }
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::manualRelease">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 153,
   FQN="llvm::ImmutableMap::manualRelease", NM="_ZN4llvm12ImmutableMap13manualReleaseEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap13manualReleaseEv")
  //</editor-fold>
  public void manualRelease() {
    assert checkAlive();
    if (Root != null) {
      Root.release();
    }
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::isEmpty">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 157,
   FQN="llvm::ImmutableMap::isEmpty", NM="_ZNK4llvm12ImmutableMap7isEmptyEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMap7isEmptyEv")
  //</editor-fold>
  public boolean isEmpty() /*const*/ {
    assert checkAlive();
    return Root == null;
  }


  //===--------------------------------------------------===//
  // Foreach - A limited form of map iteration.
  //===--------------------------------------------------===//
  /*private:*/
  /*template <typename Callback> TEMPLATE*/
  ////<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::CBWrapper">
  //@Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
  // source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 164,
  // FQN="llvm::ImmutableMap::CBWrapper", NM="_ZN4llvm12ImmutableMap9CBWrapperE",
  // cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap9CBWrapperE")
  ////</editor-fold>
  //public static class/*struct*/ CBWrapper</*typename Callback*/ KeyT, ValT> implements Type2Void<std.pairPtrPtr<KeyT, DataT>> {
  //  public TypeType2Void<KeyT, ValT> C;
  //
  //  public CBWrapper(TypeType2Void<KeyT, ValT> C) {
  //    this.C = C;
  //  }
  //  
  //  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::CBWrapper::operator()">
  //  @Converted(kind = Converted.Kind.AUTO,
  //   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 167,
  //   FQN="llvm::ImmutableMap::CBWrapper::operator()", NM="_ZN4llvm12ImmutableMap9CBWrapperclENT1_14value_type_refE",
  //   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap9CBWrapperclENT1_14value_type_refE")
  //  //</editor-fold>
  //  public void $call( std.pairPtrPtr<KeyT, DataT> V) {
  //    C.$call(V.first, V.second);
  //  }
  //
  //  
  //  @Override public String toString() {
  //    return "" + "C=" + C; // NOI18N
  //  }
  //};
  
  /*template <typename Callback> TEMPLATE*/
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::CBWrapperRef">
  @Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 170,
   FQN="llvm::ImmutableMap::CBWrapperRef", NM="_ZN4llvm12ImmutableMap12CBWrapperRefE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap12CBWrapperRefE")
  //</editor-fold>
  public static class/*struct*/ CBWrapperRef<KeyT, DataT> implements Type2Void<std.pairPtrPtr<KeyT, DataT>> {
    public final TypeType2Void<KeyT, DataT>/*&*/ C;
    //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::CBWrapperRef::CBWrapperRef<Callback>">
    @Converted(kind = Converted.Kind.AUTO,
     source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 173,
     FQN="llvm::ImmutableMap::CBWrapperRef::CBWrapperRef<Callback>", NM="_ZN4llvm12ImmutableMap12CBWrapperRefC1ERT_",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap12CBWrapperRefC1ERT_")
    //</editor-fold>
    public CBWrapperRef(final TypeType2Void<KeyT, DataT>/*&*/ c) {
      // : C(c) 
      //START JInit
      this./*&*/C=/*&*//*ParenListExpr*/c;
      //END JInit
    }

    
    //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::CBWrapperRef::operator()">
    @Converted(kind = Converted.Kind.AUTO,
     source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 175,
     FQN="llvm::ImmutableMap::CBWrapperRef::operator()", NM="_ZN4llvm12ImmutableMap12CBWrapperRefclENT1_14value_type_refE",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap12CBWrapperRefclENT1_14value_type_refE")
    //</editor-fold>
    public void $call( std.pairPtrPtr<KeyT, DataT> V) {
      C.$call(V.first, V.second);
    }

    
    @Override public String toString() {
      return "" + "C=" + C; // NOI18N
    }
  };
/*public:*/
  /*template <typename Callback> TEMPLATE*/
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::foreach">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 180,
   old_source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", old_line = 179,
   FQN="llvm::ImmutableMap::foreach", NM="Tpl__ZN4llvm12ImmutableMap7foreachERT_",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=Tpl__ZN4llvm12ImmutableMap7foreachERT_")
  //</editor-fold>
  public <T extends TypeType2Void<KeyT, DataT>> void foreach(final T /*&*/ C) {
    assert checkAlive();
    if (Root != null) {
      CBWrapperRef<KeyT, DataT> CB/*J*/= /*ParenList*/new CBWrapperRef(C);
      Root.foreach(CB);
    }
  }

  
  /*template <typename Callback> TEMPLATE*/
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::foreach">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 188,
   old_source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", old_line = 187,
   FQN="llvm::ImmutableMap::foreach", NM="Tpl__ZN4llvm12ImmutableMap7foreachEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=Tpl__ZN4llvm12ImmutableMap7foreachEv")
  //</editor-fold>
  public </*typename*/ Callback> void foreach() {
    assert checkAlive();
    throw new UnsupportedOperationException("Use foreach(new Callback()) instead!");
//    if (Root != null) {
//      CBWrapper<Callback> CB;
//      Root.foreach(CB);
//    }
  }

  
  //===--------------------------------------------------===//
  // For testing.
  //===--------------------------------------------------===//
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::verify">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 199,
   FQN="llvm::ImmutableMap::verify", NM="_ZNK4llvm12ImmutableMap6verifyEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMap6verifyEv")
  //</editor-fold>
  public void verify() /*const*/ {
    assert checkAlive();
    throw new UnsupportedOperationException("Why verify is called?");
//    if (Root != null) {
//      Root.verify();
//    }
  }

  
  //===--------------------------------------------------===//
  // Iterators.
  //===--------------------------------------------------===//
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::iterator">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 205,
   FQN="llvm::ImmutableMap::iterator", NM="_ZN4llvm12ImmutableMap8iteratorE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap8iteratorE")
  //</editor-fold>
  public static class iterator<KeyT, DataT> extends /*public*/ ImutAVLValueIteratorPtrPtrType<std.pairPtrPtr<KeyT, DataT>> {
    //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::iterator::iterator">
    @Converted(kind = Converted.Kind.AUTO,
     source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 206,
     FQN="llvm::ImmutableMap::iterator::iterator", NM="_ZN4llvm12ImmutableMap8iteratorC1Ev",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap8iteratorC1Ev")
    //</editor-fold>
    private iterator()/* = default*/ {
      super();
    }


    //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::iterator::iterator">
    @Converted(kind = Converted.Kind.AUTO,
     source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 207,
     FQN="llvm::ImmutableMap::iterator::iterator", NM="_ZN4llvm12ImmutableMap8iteratorC1EPNS_11ImutAVLTreeIT1_EE",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap8iteratorC1EPNS_11ImutAVLTreeIT1_EE")
    //</editor-fold>
    private /*explicit*/ iterator(ImutAVLTreePtrPtrType<KeyT, DataT, std.pairPtrPtr<KeyT, DataT>> /*P*/ Tree) {
      // : iterator::ImutAVLValueIterator(Tree) 
      //START JInit
      /*ParenListExpr*/super(Tree);
      //END JInit
    }

    /*friend  class ImmutableMapPtrPtr<KeyT, DataT>*/
  /*public:*/
    //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::iterator::getKey">
    @Converted(kind = Converted.Kind.AUTO,
     source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 211,
     FQN="llvm::ImmutableMap::iterator::getKey", NM="_ZNK4llvm12ImmutableMap8iterator6getKeyEv",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMap8iterator6getKeyEv")
    //</editor-fold>
    public  KeyT getKey() /*const*/ {
      return this.$star().first;
    }

    //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::iterator::getData">
    @Converted(kind = Converted.Kind.AUTO,
     source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 212,
     FQN="llvm::ImmutableMap::iterator::getData", NM="_ZNK4llvm12ImmutableMap8iterator7getDataEv",
     cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMap8iterator7getDataEv")
    //</editor-fold>
    public  DataT getData() /*const*/ {
      return this.$star().second;
    }

    private iterator(iterator<KeyT, DataT> $Prm0) {
      super($Prm0);
    }
    
    @Override public iterator<KeyT, DataT> clone() {
      return new iterator(this);
    }
    
    @Override public String toString() {
      return "" + super.toString(); // NOI18N
    }
  };
  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::begin">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 215,
   FQN="llvm::ImmutableMap::begin", NM="_ZNK4llvm12ImmutableMap5beginEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMap5beginEv")
  //</editor-fold>
  public iterator<KeyT, DataT> begin() /*const*/ {
    assert checkAlive();
    return new iterator(Root);
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::end">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 216,
   FQN="llvm::ImmutableMap::end", NM="_ZNK4llvm12ImmutableMap3endEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMap3endEv")
  //</editor-fold>
  public iterator<KeyT, DataT> end() /*const*/ {
    assert checkAlive();
    return new iterator();
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::lookup">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 218,
   FQN="llvm::ImmutableMap::lookup", NM="_ZNK4llvm12ImmutableMap6lookupENT1_12key_type_refE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMap6lookupENT1_12key_type_refE")
  //</editor-fold>
  public  type$ptr<DataT> /*P*/ /*P*/ lookup( KeyT K) /*const*/ {
    assert checkAlive();
    if (Root != null) {
      ImutAVLTreePtrPtrType<KeyT, DataT, std.pairPtrPtr<KeyT, DataT>> /*P*/ T = Root.find(K);
      if (T != null) {
        final std.pairPtrPtr<KeyT, DataT> value = T.getValue();
        return /*AddrOf*/new type$ptr$inout<DataT>(value) {
          @Override protected DataT $star$impl() { return value.second; }
          @Override protected DataT $set$impl(DataT V) { return value.second = V; }
          @Override public boolean $isNull() { return false; }
        };
      }
    }
    
    return null;
  }  
  
  
  /// getMaxElement - Returns the <key,value> pair in the ImmutableMap for
  ///  which key is the highest in the ordering of keys in the map.  This
  ///  method returns NULL if the map is empty.
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::getMaxElement">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 230,
   FQN="llvm::ImmutableMap::getMaxElement", NM="_ZNK4llvm12ImmutableMap13getMaxElementEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMap13getMaxElementEv")
  //</editor-fold>
  public  std.pairPtrPtr<KeyT, DataT> /*P*/ getMaxElement() /*const*/ {
    assert checkAlive();
    return Root != null ? /*AddrOf*/(Root.getMaxElement().getValue()) : null;
  }

  
  //===--------------------------------------------------===//
  // Utility methods.
  //===--------------------------------------------------===//
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::getHeight">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 238,
   FQN="llvm::ImmutableMap::getHeight", NM="_ZNK4llvm12ImmutableMap9getHeightEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMap9getHeightEv")
  //</editor-fold>
  public /*uint*/int getHeight() /*const*/ {
    assert checkAlive();
    return Root != null ? Root.getHeight() : 0;
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::Profile">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 240,
   FQN="llvm::ImmutableMap::Profile", NM="_ZN4llvm12ImmutableMap7ProfileERNS_16FoldingSetNodeIDERKNS_12ImmutableMapIT_T0_T1_EE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZN4llvm12ImmutableMap7ProfileERNS_16FoldingSetNodeIDERKNS_12ImmutableMapIT_T0_T1_EE")
  //</editor-fold>
  public static /*inline*/ <KeyT, DataT> void Profile(final FoldingSetNodeID /*&*/ ID, final /*const*/ ImmutableMapPtrPtr<KeyT, DataT> /*&*/ M) {
    assert M.checkAlive();
    ID.AddPointer(M.Root);
  }

  
  //<editor-fold defaultstate="collapsed" desc="llvm::ImmutableMap::Profile">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/ADT/ImmutableMap.h", line = 244,
   FQN="llvm::ImmutableMap::Profile", NM="_ZNK4llvm12ImmutableMap7ProfileERNS_16FoldingSetNodeIDE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/SVals.cpp -nm=_ZNK4llvm12ImmutableMap7ProfileERNS_16FoldingSetNodeIDE")
  //</editor-fold>
  public /*inline*/ void Profile(final FoldingSetNodeID /*&*/ ID) /*const*/ {
    assert checkAlive();
    Profile(ID, this);
    /*JAVA:return*/return;
  }

  @Override
  @Converted(kind = Converted.Kind.MANUAL_ADDED)
  public Iterator<std.pairPtrPtr<KeyT, DataT>> iterator() {
    assert checkAlive();
    return new JavaIterator(begin(), end());
  }
  
  
  @Override
  public ImmutableMapPtrPtr<KeyT, DataT> clone() {
    assert checkAlive();
    return new ImmutableMapPtrPtr<KeyT, DataT>(this);
  }
  
  @Override public String toString() {
    StringBuilder out = new StringBuilder(super.is$destroyed() ? "DESTROYED ":"");
    int idx = 0;
    for (std.pairPtrPtr<KeyT, DataT> entry : this) {
      out.append("\n[").append(idx++).append("] {");
      out.append(entry.first).append("} => {");
      out.append(entry.second).append("}");
    }
    return "ImmutableMapPtrPtr" + out.toString(); // NOI18N
  }

  final boolean checkAlive() {
    return check$Alive();
  }   
}
