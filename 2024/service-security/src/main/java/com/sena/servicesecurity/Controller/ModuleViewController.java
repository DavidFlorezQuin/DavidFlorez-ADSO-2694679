package com.sena.servicesecurity.Controller;

import com.sena.servicesecurity.Entity.ModuleView;
import com.sena.servicesecurity.IService.IModuleViewService;

public class ModuleViewController extends ABaseController<ModuleView, IModuleViewService>{

    public ModuleViewController(IModuleViewService service){
        super(service, "ModuleView");
    }
}
