# Documentation Overview

**[View the API Documentation](https://automattic.github.io/Gravatar-SDK-Android**

This branch contains the generated API documentation for the project.

## How the Documentation is Generated

1. **Tool Used**:  
   The documentation is generated using [Dokka](https://kotlinlang.org/docs/dokka-overview.html).

2. **Trigger**:  
   Documentation is generated automatically by a GitHub Actions workflow whenever a new version tag (e.g., `1.0.0`) is pushed to the repository.

3. **Process**:
    - The workflow checks out the `docs` branch.
    - Both `history/` and `current/` are copied to `docs/dokka/` directories. This is required to preserve historical documentation.
    - The workflow checks out the code at the specific tag.
    - Dokka is executed to generate HTML documentation in the `docs/dokka/` directory.
    - The workflow checks out the `docs` branch.
    - Both subdirectories from `docs/dokka/` are copied to the root of the `docs` branch.
    - The changes are committed and pushed to the `docs` branch.

4. **Versioned History**:  
   Historical documentation is preserved for each release under `history/<version>`. This allows users to browse API documentation for any version of the project.

