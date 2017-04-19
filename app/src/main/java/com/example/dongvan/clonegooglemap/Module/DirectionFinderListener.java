package com.example.dongvan.clonegooglemap.Module;

import java.util.List;

/**
 * Created by VoNga on 18-Apr-17.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> routes);
}
