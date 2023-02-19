rem Remove older artifacts. We don't want them to accumulate, only the last one
rd /s/q ..\docs\com

mvn deploy -DaltDeploymentRepository=local-repo::default::file:../docs -P release
