/*
 * Copyright (C) 2016 Oleg Chernovskiy <adonai@xaker.ru>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.kanedias.vanilla;

/**
 * This class constants should be synchronized with VanillaMusic <code>PluginUtils</code> class
 */
public class PluginConstants {

    private PluginConstants() {
    }

    // these actions are for passing between main player and plugins
    static final String ACTION_REQUEST_PLUGIN_PARAMS = "com.vanilla.action.REQUEST_PLUGIN_PARAMS"; // broadcast
    static final String ACTION_HANDLE_PLUGIN_PARAMS = "com.vanilla.action.HANDLE_PLUGIN_PARAMS"; // answer
    static final String ACTION_WAKE_PLUGIN = "com.vanilla.action.WAKE_PLUGIN"; // targeted for each found
    static final String ACTION_LAUNCH_PLUGIN = "com.vanilla.action.LAUNCH_PLUGIN"; // targeted at selected by user

    // these are used by plugins to describe themselves
    static final String EXTRA_PARAM_PLUGIN_NAME = "com.vanilla.extra.PLUGIN_NAME";
    static final String EXTRA_PARAM_PLUGIN_APP = "com.vanilla.extra.PLUGIN_APP";
    static final String EXTRA_PARAM_PLUGIN_DESC = "com.vanilla.extra.PLUGIN_DESC";

    // this is passed to plugin when it is selected by user
    static final String EXTRA_PARAM_FILE_PATH = "com.vanilla.extra.FILE_PATH";

    static final String LOG_TAG = "Vanilla:TagEditorPlugin";

    static final String VANILLA_PACKAGE_NAME = "ch.blinkenlights.android.vanilla";
    static final String VANILLA_SERVICE_NAME = ".PlaybackService";
}