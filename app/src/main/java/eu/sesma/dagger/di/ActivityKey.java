package eu.sesma.dagger.di;

import android.app.Activity;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import dagger.MapKey;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@MapKey
@Target({METHOD})
@Retention(RUNTIME)
public @interface ActivityKey {
    Class<? extends Activity> value();
}
