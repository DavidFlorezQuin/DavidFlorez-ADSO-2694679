package com.sena.servicesecurity.Controller;

import com.sena.servicesecurity.Entity.ModuleRole;
import com.sena.servicesecurity.IService.IModuleRoleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/moduleRole")



public class ModuleRoleController extends  ABaseController<ModuleRole, IModuleRoleService> {

    public ModuleRoleController(IModuleRoleService service){
        super(service, "ModuleRole");
    }
}
