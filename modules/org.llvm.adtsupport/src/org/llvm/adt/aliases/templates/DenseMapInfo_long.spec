FILE_NAME = DenseMapInfoLong
CLASS_SUFFIX =
IMPLEMENTS_DENSE_MAP_INFO=
TYPE_SUFFIX =
JAVA_CLASS_DESCRIPTION=DenseMapInfo<long>
TYPE = long
RAW_TYPE = long
EXTRA_ASSERT_FOR_EMPTY_TOMBSTONE_KEYS=
COMMENT_ALT=//
DEFAULT_EMPTY_KEY=~0L/*L*/
DEFAULT_TOMBSTONE_KEY=~0L/*L*/-1L
DEFAULT_HASH_VALUE_IMPL=return (int)(Key * 37L/*L*/);
DEFAULT_HASH_VALUE_ALT_IMPL=throw new UnsupportedOperationException("Override to support alternative Key types with hash same as Key");
DEFAULT_EQUAL_KEY_IMPL=return LHS == RHS;
DEFAULT_EQUAL_ALT_KEY_IMPL=throw new UnsupportedOperationException("Override to support alternative Key types comparable with Key");
DEFAULT_POINTER_LIKE_IMPL = // never copy integrals\n    return true;
EXTRA_ASSERT_FOR_KEY=
EXTRA_ASSERT_FOR_ALT_KEY=
EXTRA_ASSERT_FOR_EQUAL_KEYS=
CHECK_KEY_CLASS_IMPL=
