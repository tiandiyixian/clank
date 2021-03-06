FILE_NAME = DenseMapTypeBool
CLASS_SUFFIX = <KeyT>
PAIR_TYPE = std.pairTypeBool<KeyT>
PAIR_NAME = std.pairTypeBool
KEY_TYPE = KeyT
RAW_KEY_TYPE = Object
VALUE_TYPE = boolean
VALUE_CLASS = Class<Boolean>
DENSE_MAP_INFO = DenseMapInfo<KeyT>
DENSE_MAP_BASE = DenseMapBaseTypeBool<DenseMapTypeBool<KeyT>, KeyT>
CREATE_NEW_BUCKET_PAIR = isKeyPointerLike() ? new std.pairPtrBool() : new std.pairTypeBool()
