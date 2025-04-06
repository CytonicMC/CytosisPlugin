package net.cytonic.plugin;

import net.cytonic.cytosis.plugins.CytosisPlugin;
import net.cytonic.cytosis.plugins.annotations.Dependency;
import net.cytonic.cytosis.plugins.annotations.Plugin;

@Plugin(
        name = "example-plugin",
        version = "1.0-SNAPSHOT",
        description = "An example plugin for Cytosis",
        authors = {"Cytosis Developers"},
        dependencies = {
                @Dependency(id = "example-dependency")
        }
)
public class Main implements CytosisPlugin {

    @Override
    public void initialize() {
        // called on load
    }

    @Override
    public void shutdown() {
        // called on unload
    }
}