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


package org.llvm.adt;

import org.clank.support.Converted;
import org.clank.support.JavaDifferentiators.*;
import org.clank.support.aliases.type$ptr;

@Converted(kind = Converted.Kind.MANUAL_SEMANTIC)
public final class PointerUnion3<PT1, PT2, PT3> extends PointerUnionBase<PointerUnion3<PT1, PT2, PT3>> {

  public PointerUnion3(Class<PT1> cls) {
    // null of the first class
    super(cls, (PT1)null);
  }

  public PointerUnion3(JD$T _diff, Class<PT1> cls, PT1 Val) {
    super(cls, Val);
  }
  
  public PointerUnion3(JD$T1 _diff, Class<PT2> cls, PT2 Val) {
    super(cls, Val);
  }
  
  public PointerUnion3(JD$T2 _diff, Class<PT3> cls, PT3 Val) {
    super(cls, Val);
  }

  public PointerUnion3<PT1, PT2, PT3> $assign_T$C$R(Class<PT1> cls, final /*const*/ PT1 /*&*/ RHS) {
    super.assign_impl(cls, RHS);
    return this;
  }

  public PointerUnion3<PT1, PT2, PT3> $assign_T1$C$R(Class<PT2> cls, final /*const*/ PT2 /*&*/ RHS) {
    super.assign_impl(cls, RHS);
    return this;  
  }
  
  public PointerUnion3<PT1, PT2, PT3> $assign_T2$C$R(Class<PT3> cls, final /*const*/ PT3 /*&*/ RHS) {
    super.assign_impl(cls, RHS);
    return this;
  }
  
  public /*const*/ type$ptr<PT1 /*P*/> getAddrOfPtr1$Const(Class<PT1> cls) /*const*/ {
    return super.$getAddrOfPointer(cls);
  }
  
  public type$ptr<PT1 /*P*/> getAddrOfPtr1(Class<PT1> cls) {
    return super.$getAddrOfPointer(cls);
  }   
  
  public static <T1, T2, T3> PointerUnion3<T1, T2, T3> getFromOpaqueValue(Object Data){
    PointerUnion3<T1, T2, T3> V = new PointerUnion3(Data);
    return V;
  };
  
  public PointerUnion3(PointerUnion3<PT1, PT2, PT3> /*&*/ RHS) {
    super(RHS);
  }

  public PointerUnion3(JD$Move _dparam, PointerUnion3<PT1, PT2, PT3> /*&*/ RHS) {
    super(_dparam, RHS);
  }  
  
  @Override
  public PointerUnion3<PT1, PT2, PT3> clone() {
    return new PointerUnion3(this);
  }
  
  private PointerUnion3(Object Data) { super(Data); }

}
