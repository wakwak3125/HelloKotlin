public class build extends groovy.lang.Script {
    public static void main(String[] args) {
        new build(new groovy.lang.Binding(args)).run();
    }

    public Object run() {
// Top-level build file where you can add configuration options common to all sub-projects/modules.

        buildscript(new groovy.lang.Closure<Object>(this, this) {
            public void doCall(Object it) {
                repositories(new groovy.lang.Closure<org.gradle.api.artifacts.repositories.MavenArtifactRepository>(build.this, build.this) {
                    public org.gradle.api.artifacts.repositories.MavenArtifactRepository doCall(Object it) {
                        return jcenter();
                    }

                    public MavenArtifactRepository doCall() {
                        return doCall(null);
                    }

                });
                dependencies(new groovy.lang.Closure<Object>(build.this, build.this) {
                    public Object doCall(Object it) {
                        return classpath(new Object[]{"com.android.tools.build:gradle:1.2.3"});

                        // NOTE: Do not place your application dependencies here; they belong
                        // in the individual module build.gradle files
                    }

                    public Object doCall() {
                        return doCall(null);
                    }

                });
            }

            public void doCall() {
                doCall(null);
            }

        });

        allprojects(new groovy.lang.Closure<Object>(this, this) {
            public void doCall(org.gradle.api.Project it) {
                repositories(new groovy.lang.Closure<org.gradle.api.artifacts.repositories.MavenArtifactRepository>(build.this, build.this) {
                    public org.gradle.api.artifacts.repositories.MavenArtifactRepository doCall(Object it) {
                        return jcenter();
                    }

                    public MavenArtifactRepository doCall() {
                        return doCall(null);
                    }

                });
            }

            public void doCall() {
                doCall(null);
            }

        });
        return null;

    }

    public build(Binding binding) {
        super(binding);
    }

    public build() {
        super();
    }
}
