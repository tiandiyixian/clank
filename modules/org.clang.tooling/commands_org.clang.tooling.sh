# Used directories
mkdir -p ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling
mkdir -p ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/core
mkdir -p ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/core/TypeName
mkdir -p ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/core/TypeName/impl
mkdir -p ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/core/impl
mkdir -p ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/fixit
mkdir -p ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/fixit/internal
mkdir -p ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl
mkdir -p ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/llvm/yaml

# Global and static Enums
${SPUTNIK}/contrib/JConvert/jclank.sh -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/ArgumentsAdjusters.cpp "-nm=_ZN5clang7tooling22ArgumentInsertPositionE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/ArgumentInsertPosition.java

# Global and static CXXRecords, ClassTemplates, ClassTemplateSpecializations
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Tooling.cpp "-nm=_ZN5clang7tooling9ClangToolE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/ClangTool.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/CommonOptionsParser.cpp "-nm=_ZN5clang7tooling19CommonOptionsParserE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/CommonOptionsParser.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/CompilationDatabase.cpp "-nm=_ZN5clang7tooling19CompilationDatabaseE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/CompilationDatabase.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/CompilationDatabase.cpp ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/JSONCompilationDatabase.cpp "-nm=_ZN5clang7tooling25CompilationDatabasePluginE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/CompilationDatabasePlugin.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/CompilationDatabase.cpp "-nm=_ZN5clang7tooling14CompileCommandE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/CompileCommand.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/FileMatchTrie.cpp "-nm=_ZN5clang7tooling13FileMatchTrieE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/FileMatchTrie.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/CompilationDatabase.cpp "-nm=_ZN5clang7tooling24FixedCompilationDatabaseE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/FixedCompilationDatabase.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Tooling.cpp "-nm=_ZN5clang7tooling21FrontendActionFactoryE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/FrontendActionFactory.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/JSONCompilationDatabase.cpp "-nm=_ZN5clang7tooling23JSONCompilationDatabaseE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/JSONCompilationDatabase.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/FileMatchTrie.cpp "-nm=_ZN5clang7tooling14PathComparatorE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/PathComparator.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/RefactoringCallbacks.cpp "-nm=_ZN5clang7tooling19RefactoringCallbackE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/RefactoringCallback.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Refactoring.cpp "-nm=_ZN5clang7tooling15RefactoringToolE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/RefactoringTool.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/RefactoringCallbacks.cpp "-nm=_ZN5clang7tooling24ReplaceIfStmtWithItsBodyE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/ReplaceIfStmtWithItsBody.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/RefactoringCallbacks.cpp "-nm=_ZN5clang7tooling19ReplaceStmtWithStmtE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/ReplaceStmtWithStmt.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/RefactoringCallbacks.cpp "-nm=_ZN5clang7tooling19ReplaceStmtWithTextE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/ReplaceStmtWithText.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Tooling.cpp "-nm=_ZN5clang7tooling19SourceFileCallbacksE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/SourceFileCallbacks.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Tooling.cpp "-nm=_ZN5clang7tooling10ToolActionE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/ToolAction.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Tooling.cpp "-nm=_ZN5clang7tooling14ToolInvocationE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/ToolInvocation.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Core/Replacement.cpp "-nm=_ZN5clang7tooling5RangeE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/core/Range.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/tools/extra/clang-tidy/ClangTidy.cpp ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Core/Replacement.cpp "-nm=_ZN5clang7tooling11ReplacementE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/core/Replacement.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/tools/extra/clang-tidy/ClangTidy.cpp "-nm=_ZN5clang7tooling27TranslationUnitReplacementsE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/core/TranslationUnitReplacements.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Core/Replacement.cpp "-nm=_ZN5clang7tooling12_GLOBAL__N_117MergedReplacementE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/core/impl/MergedReplacement.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Tooling.cpp "-nm=_ZN5clang7tooling12_GLOBAL__N_116ASTBuilderActionE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/ASTBuilderAction.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/CommonOptionsParser.cpp "-nm=_ZN12_GLOBAL__N_130ArgumentsAdjustingCompilationsE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/ArgumentsAdjustingCompilations.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/JSONCompilationDatabase.cpp "-nm=_ZN5clang7tooling12_GLOBAL__N_125CommandLineArgumentParserE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/CommandLineArgumentParser.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/CompilationDatabase.cpp "-nm=_ZN12_GLOBAL__N_118CompileJobAnalyzerE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/CompileJobAnalyzer.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/FileMatchTrie.cpp "-nm=_ZN12_GLOBAL__N_121DefaultPathComparatorE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/DefaultPathComparator.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/FileMatchTrie.cpp "-nm=_ZN5clang7tooling17FileMatchTrieNodeE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/FileMatchTrieNode.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/JSONCompilationDatabase.cpp "-nm=_ZN5clang7tooling12_GLOBAL__N_129JSONCompilationDatabasePluginE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/JSONCompilationDatabasePlugin.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/CompilationDatabase.cpp "-nm=_ZN12_GLOBAL__N_110MatchesAnyE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/MatchesAny.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Tooling.cpp "-nm=_ZN5clang7tooling12_GLOBAL__N_127SingleFrontendActionFactoryE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/SingleFrontendActionFactory.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/CompilationDatabase.cpp "-nm=_ZN12_GLOBAL__N_123UnusedInputDiagConsumerE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/UnusedInputDiagConsumer.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/tools/extra/clang-tidy/ClangTidy.cpp "-nm=_ZN4llvm4yaml13MappingTraitsIN5clang7tooling11ReplacementEEE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/llvm/yaml/MappingTraitsReplacement.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/tools/extra/clang-tidy/ClangTidy.cpp "-nm=_ZN4llvm4yaml13MappingTraitsIN5clang7tooling27TranslationUnitReplacementsEEE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/llvm/yaml/MappingTraitsTranslationUnitReplacements.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/tools/extra/clang-tidy/ClangTidy.cpp "-nm=_ZN4llvm4yaml14SequenceTraitsISt6vectorIN5clang7tooling11ReplacementESaIS5_EEEE;" > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/llvm/yaml/SequenceTraitsVector\$Replacement.java

# Static functions/variables
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Core/Lookup.cpp "-nm=_ZL16isFullyQualifiedPKN5clang19NestedNameSpecifierE;_ZL22getBestNamespaceSubstrPKN5clang11DeclContextEN4llvm9StringRefEb;_ZL38isInsideDifferentNamespaceWithSameNamePKN5clang11DeclContextES2_;" -static-type=LookupStatics -package=org.clang.tooling.core.impl > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/core/impl/LookupStatics.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/CompilationDatabase.cpp "-nm=_ZL19stripPositionalArgsSt6vectorIPKcSaIS1_EERS_INSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaIS9_EE;_ZL36findCompilationDatabaseFromDirectoryN4llvm9StringRefERNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE;" -static-type=CompilationDatabaseStatics -package=org.clang.tooling.impl > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/CompilationDatabaseStatics.java

# Global functions/variables for namespace as packages
${SPUTNIK}/contrib/JConvert/jclank.sh -body-delegate -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Format/Format.cpp ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Core/Lookup.cpp ${LLVM_SRC}/llvm/tools/clang/tools/extra/clang-tidy/modernize/UseDefaultCheck.cpp "-nm=Tpl__ZN5clang7tooling24newFrontendActionFactoryEPT_PNS0_19SourceFileCallbacksE;Tpl__ZN5clang7tooling24newFrontendActionFactoryEv;_ZN5clang7tooling11deduplicateERSt6vectorINS0_11ReplacementESaIS2_EERS1_INS0_5RangeESaIS6_EE;_ZN5clang7tooling13newInvocationEPNS_17DiagnosticsEngineERKN4llvm11SmallVectorIPKcLj16EEE;_ZN5clang7tooling13runToolOnCodeEPNS_14FrontendActionERKN4llvm5TwineES6_St10shared_ptrINS_22PCHContainerOperationsEE;_ZN5clang7tooling15getAbsolutePathB5cxx11EN4llvm9StringRefE;_ZN5clang7tooling16buildASTFromCodeERKN4llvm5TwineES4_St10shared_ptrINS_22PCHContainerOperationsEE;_ZN5clang7tooling16combineAdjustersESt8functionIFSt6vectorINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaIS8_EERKSA_N4llvm9StringRefEEESG_;_ZN5clang7tooling17mergeReplacementsERKSt3setINS0_11ReplacementESt4lessIS2_ESaIS2_EES8_;_ZN5clang7tooling17replaceNestedNameB5cxx11EPKNS_19NestedNameSpecifierEPKNS_11DeclContextEPKNS_9NamedDeclEN4llvm9StringRefE;_ZN5clang7tooling19shiftedCodePositionERKSt3setINS0_11ReplacementESt4lessIS2_ESaIS2_EEj;_ZN5clang7tooling19shiftedCodePositionERKSt6vectorINS0_11ReplacementESaIS2_EEj;_ZN5clang7tooling20applyAllReplacementsB5cxx11EN4llvm9StringRefERKSt3setINS0_11ReplacementESt4lessIS4_ESaIS4_EE;_ZN5clang7tooling20applyAllReplacementsERKSt3setINS0_11ReplacementESt4lessIS2_ESaIS2_EERNS_8RewriterE;_ZN5clang7tooling20applyAllReplacementsERKSt6vectorINS0_11ReplacementESaIS2_EERNS_8RewriterE;_ZN5clang7tooling21runToolOnCodeWithArgsEPNS_14FrontendActionERKN4llvm5TwineERKSt6vectorINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaISD_EES6_S6_St10shared_ptrINS_22PCHContainerOperationsEERKS7_ISt4pairISD_SD_ESaISM_EE;_ZN5clang7tooling22calculateChangedRangesERKSt3setINS0_11ReplacementESt4lessIS2_ESaIS2_EE;_ZN5clang7tooling23groupReplacementsByFileB5cxx11ERKSt3setINS0_11ReplacementESt4lessIS2_ESaIS2_EE;_ZN5clang7tooling24buildASTFromCodeWithArgsERKN4llvm5TwineERKSt6vectorINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaISB_EES4_S4_St10shared_ptrINS_22PCHContainerOperationsEE;_ZN5clang7tooling25getInsertArgumentAdjusterB5cxx11EPKcNS0_22ArgumentInsertPositionE;_ZN5clang7tooling25getInsertArgumentAdjusterERKSt6vectorINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaIS7_EENS0_22ArgumentInsertPositionE;_ZN5clang7tooling26getClangSyntaxOnlyAdjusterB5cxx11Ev;_ZN5clang7tooling27getClangStripOutputAdjusterB5cxx11Ev;_ZN5clang7tooling29formatAndApplyAllReplacementsERKSt3setINS0_11ReplacementESt4lessIS2_ESaIS2_EERNS_8RewriterEN4llvm9StringRefE;_ZN5clang7tooling30addTargetAndModeForProgramNameERSt6vectorINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaIS7_EEN4llvm9StringRefE;_ZN5clang7tooling32calculateRangesAfterReplacementsERKSt3setINS0_11ReplacementESt4lessIS2_ESaIS2_EERKSt6vectorINS0_5RangeESaISA_EE;_ZN5clang7toolingeqERKNS0_11ReplacementES3_;_ZN5clang7toolingltERKNS0_11ReplacementES3_;" -static-type=ToolingGlobals -package=org.clang.tooling > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/ToolingGlobals.java
    ${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Core/Replacement.cpp "-nm=_ZN5clang7tooling11deduplicateERSt6vectorINS0_11ReplacementESaIS2_EERS1_INS0_5RangeESaIS6_EE;_ZN5clang7tooling17mergeReplacementsERKSt3setINS0_11ReplacementESt4lessIS2_ESaIS2_EES8_;_ZN5clang7tooling19shiftedCodePositionERKSt3setINS0_11ReplacementESt4lessIS2_ESaIS2_EEj;_ZN5clang7tooling19shiftedCodePositionERKSt6vectorINS0_11ReplacementESaIS2_EEj;_ZN5clang7tooling20applyAllReplacementsB5cxx11EN4llvm9StringRefERKSt3setINS0_11ReplacementESt4lessIS4_ESaIS4_EE;_ZN5clang7tooling20applyAllReplacementsERKSt3setINS0_11ReplacementESt4lessIS2_ESaIS2_EERNS_8RewriterE;_ZN5clang7tooling20applyAllReplacementsERKSt6vectorINS0_11ReplacementESaIS2_EERNS_8RewriterE;_ZN5clang7tooling22calculateChangedRangesERKSt3setINS0_11ReplacementESt4lessIS2_ESaIS2_EE;_ZN5clang7tooling23groupReplacementsByFileB5cxx11ERKSt3setINS0_11ReplacementESt4lessIS2_ESaIS2_EE;_ZN5clang7tooling32calculateRangesAfterReplacementsERKSt3setINS0_11ReplacementESt4lessIS2_ESaIS2_EERKSt6vectorINS0_5RangeESaISA_EE;_ZN5clang7toolingeqERKNS0_11ReplacementES3_;_ZN5clang7toolingltERKNS0_11ReplacementES3_;" -static-type=ReplacementToolingGlobals -package=org.clang.tooling.core.impl > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/core/impl/ReplacementToolingGlobals.java
    ${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/ArgumentsAdjusters.cpp "-nm=_ZN5clang7tooling16combineAdjustersESt8functionIFSt6vectorINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaIS8_EERKSA_N4llvm9StringRefEEESG_;_ZN5clang7tooling25getInsertArgumentAdjusterB5cxx11EPKcNS0_22ArgumentInsertPositionE;_ZN5clang7tooling25getInsertArgumentAdjusterERKSt6vectorINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaIS7_EENS0_22ArgumentInsertPositionE;_ZN5clang7tooling26getClangSyntaxOnlyAdjusterB5cxx11Ev;_ZN5clang7tooling27getClangStripOutputAdjusterB5cxx11Ev;" -static-type=ArgumentsAdjustersToolingGlobals -package=org.clang.tooling.impl > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/ArgumentsAdjustersToolingGlobals.java
    ${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Core/Lookup.cpp "-nm=_ZN5clang7tooling17replaceNestedNameB5cxx11EPKNS_19NestedNameSpecifierEPKNS_11DeclContextEPKNS_9NamedDeclEN4llvm9StringRefE;" -static-type=LookupToolingGlobals -package=org.clang.tooling.core.impl > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/core/impl/LookupToolingGlobals.java
    ${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Tooling.cpp "-nm=Tpl__ZN5clang7tooling24newFrontendActionFactoryEPT_PNS0_19SourceFileCallbacksE;Tpl__ZN5clang7tooling24newFrontendActionFactoryEv;_ZN5clang7tooling13newInvocationEPNS_17DiagnosticsEngineERKN4llvm11SmallVectorIPKcLj16EEE;_ZN5clang7tooling13runToolOnCodeEPNS_14FrontendActionERKN4llvm5TwineES6_St10shared_ptrINS_22PCHContainerOperationsEE;_ZN5clang7tooling15getAbsolutePathB5cxx11EN4llvm9StringRefE;_ZN5clang7tooling16buildASTFromCodeERKN4llvm5TwineES4_St10shared_ptrINS_22PCHContainerOperationsEE;_ZN5clang7tooling21runToolOnCodeWithArgsEPNS_14FrontendActionERKN4llvm5TwineERKSt6vectorINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaISD_EES6_S6_St10shared_ptrINS_22PCHContainerOperationsEERKS7_ISt4pairISD_SD_ESaISM_EE;_ZN5clang7tooling24buildASTFromCodeWithArgsERKN4llvm5TwineERKSt6vectorINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaISB_EES4_S4_St10shared_ptrINS_22PCHContainerOperationsEE;_ZN5clang7tooling30addTargetAndModeForProgramNameERSt6vectorINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaIS7_EEN4llvm9StringRefE;" -static-type=ToolingToolingGlobals -package=org.clang.tooling.impl > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/ToolingToolingGlobals.java
    ${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Refactoring.cpp "-nm=_ZN5clang7tooling29formatAndApplyAllReplacementsERKSt3setINS0_11ReplacementESt4lessIS2_ESaIS2_EERNS_8RewriterEN4llvm9StringRefE;" -static-type=RefactoringToolingGlobals -package=org.clang.tooling.impl > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/RefactoringToolingGlobals.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Core/QualTypeNames.cpp "-nm=_ZN5clang8TypeName21getFullyQualifiedNameB5cxx11ENS_8QualTypeERKNS_10ASTContextEb;" -static-type=TypeNameGlobals -package=org.clang.tooling.core.TypeName > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/core/TypeName/TypeNameGlobals.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/FixIt.cpp "-nm=Tpl__ZN5clang7tooling5fixit13createRemovalERKT_;Tpl__ZN5clang7tooling5fixit17createReplacementERKT_RKT0_RKNS_10ASTContextE;Tpl__ZN5clang7tooling5fixit7getTextERKT_RKNS_10ASTContextE;" -static-type=FixitGlobals -package=org.clang.tooling.fixit > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/fixit/FixitGlobals.java
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/FixIt.cpp "-nm=Tpl__ZN5clang7tooling5fixit8internal14getSourceRangeERKT_;_ZN5clang7tooling5fixit8internal14getSourceRangeERKNS_11SourceRangeE;_ZN5clang7tooling5fixit8internal14getSourceRangeERKNS_14SourceLocationE;_ZN5clang7tooling5fixit8internal7getTextENS_11SourceRangeERKNS_10ASTContextE;" -static-type=InternalGlobals -package=org.clang.tooling.fixit.internal > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/fixit/internal/InternalGlobals.java

# Static functions/variables for namespaces as packages
${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Core/QualTypeNames.cpp "-nm=_ZN5clang8TypeNameL14createOuterNNSERKNS_10ASTContextEPKNS_4DeclEbb;_ZN5clang8TypeNameL21getFullyQualifiedTypeENS_8QualTypeERKNS_10ASTContextEb;_ZN5clang8TypeNameL25createNestedNameSpecifierERKNS_10ASTContextEPKNS_13NamespaceDeclEb;_ZN5clang8TypeNameL25createNestedNameSpecifierERKNS_10ASTContextEPKNS_8TypeDeclEbb;_ZN5clang8TypeNameL29getFullyQualifiedTemplateNameERKNS_10ASTContextERNS_12TemplateNameEb;_ZN5clang8TypeNameL29getFullyQualifiedTemplateTypeERKNS_10ASTContextEPKNS_4TypeEb;_ZN5clang8TypeNameL33getFullyQualifiedTemplateArgumentERKNS_10ASTContextERNS_16TemplateArgumentEb;_ZN5clang8TypeNameL35createNestedNameSpecifierForScopeOfERKNS_10ASTContextEPKNS_4DeclEbb;_ZN5clang8TypeNameL35createNestedNameSpecifierForScopeOfERKNS_10ASTContextEPKNS_4TypeEbb;_ZN5clang8TypeNameL36getFullyQualifiedNestedNameSpecifierERKNS_10ASTContextEPNS_19NestedNameSpecifierEb;" -static-type=TypeNameStatics -package=org.clang.tooling.core.TypeName.impl > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/core/TypeName/impl/TypeNameStatics.java
${SPUTNIK}/contrib/JConvert/jclank.sh -body-delegate -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/CompilationDatabase.cpp ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/JSONCompilationDatabase.cpp ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/RefactoringCallbacks.cpp ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Core/Replacement.cpp ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Tooling.cpp "-nm=Tpl__ZN5clang7tooling27shiftedCodePositionInternalERKT_j;_ZN5clang7tooling12_GLOBAL__N_119unescapeCommandLineB5cxx11EN4llvm9StringRefE;_ZN5clang7tooling16JSONAnchorSourceE;_ZN5clang7toolingL12getRangeSizeERKNS_13SourceManagerERKNS_15CharSourceRangeERKNS_11LangOptionsE;_ZN5clang7toolingL14JSONAnchorDestE;_ZN5clang7toolingL15InvalidLocationE;_ZN5clang7toolingL15getCC1ArgumentsEPNS_17DiagnosticsEngineEPNS_6driver11CompilationE;_ZN5clang7toolingL17injectResourceDirERSt6vectorINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaIS7_EEPKcPv;_ZN5clang7toolingL17nodeToCommandLineB5cxx11ERKSt6vectorIPN4llvm4yaml10ScalarNodeESaIS5_EE;_ZN5clang7toolingL18mergeAndSortRangesESt6vectorINS0_5RangeESaIS2_EE;_ZN5clang7toolingL19replaceStmtWithStmtERNS_13SourceManagerERKNS_4StmtES5_;_ZN5clang7toolingL19replaceStmtWithTextERNS_13SourceManagerERKNS_4StmtEN4llvm9StringRefE;_ZN5clang7toolingL1XE;_ZN5clang7toolingL21getSyntaxOnlyToolArgsERKN4llvm5TwineERKSt6vectorINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaISB_EENS1_9StringRefE;_ZN5clang7toolingL9newDriverEPNS_17DiagnosticsEngineEPKcN4llvm18IntrusiveRefCntPtrINS_3vfs10FileSystemEEE;" -static-type=ToolingStatics -package=org.clang.tooling.impl > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/ToolingStatics.java
    ${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Core/Replacement.cpp "-nm=Tpl__ZN5clang7tooling27shiftedCodePositionInternalERKT_j;_ZN5clang7toolingL12getRangeSizeERKNS_13SourceManagerERKNS_15CharSourceRangeERKNS_11LangOptionsE;_ZN5clang7toolingL18mergeAndSortRangesESt6vectorINS0_5RangeESaIS2_EE;" -static-type=ReplacementToolingStatics -package=org.clang.tooling.core.impl > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/core/impl/ReplacementToolingStatics.java
    ${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/RefactoringCallbacks.cpp "-nm=_ZN5clang7toolingL19replaceStmtWithStmtERNS_13SourceManagerERKNS_4StmtES5_;_ZN5clang7toolingL19replaceStmtWithTextERNS_13SourceManagerERKNS_4StmtEN4llvm9StringRefE;" -static-type=RefactoringCallbacksToolingStatics -package=org.clang.tooling.impl > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/RefactoringCallbacksToolingStatics.java
    ${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/JSONCompilationDatabase.cpp "-nm=_ZN5clang7tooling12_GLOBAL__N_119unescapeCommandLineB5cxx11EN4llvm9StringRefE;_ZN5clang7toolingL17nodeToCommandLineB5cxx11ERKSt6vectorIPN4llvm4yaml10ScalarNodeESaIS5_EE;" -static-type=JSONCompilationDatabaseToolingStatics -package=org.clang.tooling.impl > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/JSONCompilationDatabaseToolingStatics.java
    ${SPUTNIK}/contrib/JConvert/jclank.sh -empty-body -java-options=${SPUTNIK}/modules/org.clang.tooling/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Tooling/Tooling.cpp "-nm=_ZN5clang7toolingL15getCC1ArgumentsEPNS_17DiagnosticsEngineEPNS_6driver11CompilationE;_ZN5clang7toolingL17injectResourceDirERSt6vectorINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaIS7_EEPKcPv;_ZN5clang7toolingL21getSyntaxOnlyToolArgsERKN4llvm5TwineERKSt6vectorINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEESaISB_EENS1_9StringRefE;_ZN5clang7toolingL9newDriverEPNS_17DiagnosticsEngineEPKcN4llvm18IntrusiveRefCntPtrINS_3vfs10FileSystemEEE;" -static-type=ToolingToolingStatics -package=org.clang.tooling.impl > ${SPUTNIK}/modules/org.clang.tooling/src/org/clang/tooling/impl/ToolingToolingStatics.java
