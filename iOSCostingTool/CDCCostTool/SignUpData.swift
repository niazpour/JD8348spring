//
//  SignUpData.swift
//  CDCCostTool
//

import Foundation

class SignUpData {
    var agency: String;
    var role: String;
    var email: String;
    var phone: String;
    var isRetroHours: Bool;
    var isLeadContact: Bool;
    var firstDate: String;
    
    init(){
        self.agency = "";
        self.role = "";
        self.isRetroHours = false;
        self.email = "";
        self.isLeadContact = false;
        self.phone = "";
        self.firstDate = "";
    }
    
}
