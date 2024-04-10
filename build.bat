@echo off

set DEBUG_MODE=

if "%1" == "debug" (
  set DEBUG_MODE=debug
)

cd com.cdsoftware.lirion.structure.targetplatform
call .\plugin-builder.bat %DEBUG_MODE% ..\com.cdsoftware.lirion.structure ..\com.cdsoftware.lirion.structure.test
cd ..
