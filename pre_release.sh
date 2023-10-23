set -eu

NEW_DOC_VER="**Latest Version: $1**"
NEW_BUILD_VER="  val releaseVersion = \"$1\""

echo "Updating versions to $1 ..."
sed -i '/**Latest Version/c\'"$NEW_DOC_VER" docs/index.md
sed -i '/  val releaseVersion/c\'"$NEW_BUILD_VER" project/Version.scala