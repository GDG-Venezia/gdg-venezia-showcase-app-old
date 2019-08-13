//
//  EventViewController.swift
//  iosApp
//
//  Created by Marco Gomiero on 10/08/2019.
//

import UIKit
import app

class EventViewController: UIViewController, EventListView {
    
    @IBOutlet weak var labelToolbar: UILabel!
    @IBOutlet weak var collectionView: UICollectionView!
    private lazy var presenter = ServiceLocator.init().eventListPresenter    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        // Do any additional setup after loading the view.
        self.labelToolbar.text = "GDG Venezia"
        self.labelToolbar.font = Fonts.get(.regular, size: Fonts.Sizes.xLarge)
        
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

    
    func renderError(errorMessage: String) {
        print(errorMessage)
    }
    
    func renderLoading(visible: Bool) {
        print("Setting loading visible \(visible)")
    }
    
    func renderEventList(eventList: EventListModel) {
        // TODO
    }
}
