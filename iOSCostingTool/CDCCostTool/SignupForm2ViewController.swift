//
//  SignupForm2ViewController.swift
//  CDCCostTool
//
 

import UIKit

class SignupForm2ViewController: UIViewController  {
    
    
    var signupData : SignUpData?
    
    
    @IBOutlet weak var phone: UITextField!
    @IBOutlet weak var email: UITextField!
    //Properties
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        print(signupData?.isLeadContact ?? false);
        print(signupData?.role ?? "");
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if let viewController3 = segue.destination as? SignupForm3ViewController {
            signupData?.email = email.text ?? "";
            signupData?.phone = phone.text ?? "";
            viewController3.signupData = signupData;
        }
    }
    
}
