const config = {
    branches: ['main'],
    plugings: [
        "@semantic-release/commit-analyzer",
        "@semantic-release/release-notes-generator",
        ["@semantic-release/exec", {
            "verifyReleaseCmd": "./pre_release.sh ${nextRelease.version}"
        }]
        ["@semantic-release/changelog", {
          "changelogFile": "docs/CHANGELOG.md"
        }],
        ["@semantic-release/git", {
            "assets": ["docs/CHANGELOG.md", "docs/index.md", "project/Version.scala"],
            "message": "chore (release): ${nextRelease.version} [skip ci]\n\n${nextRelease.notes}"
        }],
        "@semantic-release/guthub"
    ]
};
module.exports = config