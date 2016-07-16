package com.i906.mpt.internal;

import com.i906.mpt.mosque.ui.MosqueFragment;
import com.i906.mpt.prayer.ui.PrayerFragment;

import dagger.Subcomponent;

/**
 * @author Noorzaini Ilhami
 */
@PerActivity
@Subcomponent(modules = {
        ActivityModule.class,
})
public interface ActivityGraph {
    void inject(MosqueFragment fragment);
    void inject(PrayerFragment fragment);
}
