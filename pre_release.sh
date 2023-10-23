set -eu

NEW_DOC_VER="**Latest Version: $NEW**"
NEW_BUILD_VER="  val releaseVersion = \"$NEW\""

echo "Updating versions to $NEW ..."
sed -i '/**Latest Version/c\'"$NEW_DOC_VER" docs/index.md
sed -i '/  val releaseVersion/c\'"$NEW_BUILD_VER" project/Version.scala