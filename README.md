# APSA Action smoke test

Post-release check for the [APSA](https://github.com/ictechgy/apsa) GitHub Action.
The workflow runs the Action pinned to a release commit with its default inputs and
uploads the SARIF result to this repository's code scanning.

`app/` is a small, deliberately insecure **synthetic** Android project written for this
test. It is not a real app and must not be reused.
