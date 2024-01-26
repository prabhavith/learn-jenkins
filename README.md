# learn-jenkins

various stages  in CI/CD pipeline
code checkout => compile/download dependencies => unit test cases => Integration test cases => Build => Release => Deploy

All the above stages in a pipeline should run depending on the situation in git repository.
If in main branch ; code checkout => compile/download deps => Build
If in dev branch ; code checkout=> compile/download deps => unit test cases
If PR is raised ; code checkout=> compile/download deps => unit test cases => integration test
If tag is created for release ; code checkout => compile/download deps => Build => Release

As per the above conditions, the pipeline stages should be run.