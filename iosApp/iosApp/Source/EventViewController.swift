//
//  EventViewController.swift
//  iosApp
//
//  Created by Marco Gomiero on 10/08/2019.
//

import UIKit
import app

class EventViewController: UIViewController, EventListView {

    private lazy var presenter = ServiceLocator.init().eventListPresenter

    
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(animated)
        presenter.attachView(view: self)
        self.navigationController?.setNavigationBarHidden( true, animated: animated )
        
    }
    
    override func viewWillDisappear(_ animated: Bool) {
        super.viewWillDisappear(animated)
        presenter.detachView()
    }
    
    func renderEventList(eventList: [EventModel]) {
        for event in eventList {
            //            label.text = (label.text ?? "") + event.title + ", "
        }
    }
    
    func renderError(errorMessage: String) {
        print(errorMessage)
    }
    
    func renderLoading(visible: Bool) {
        print("Setting loading visible \(visible)")
    }

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
